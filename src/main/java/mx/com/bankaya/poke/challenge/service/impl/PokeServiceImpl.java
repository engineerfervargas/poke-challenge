package mx.com.bankaya.poke.challenge.service.impl;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;
import mx.com.bankaya.poke.challenge.entity.Event;
import mx.com.bankaya.poke.challenge.exception.PokemonException;
import mx.com.bankaya.poke.challenge.model.Method;
import mx.com.bankaya.poke.challenge.pokeapi.Ability_;
import mx.com.bankaya.poke.challenge.pokeapi.Pokemon;
import mx.com.bankaya.poke.challenge.pokeapi.Version_;
import mx.com.bankaya.poke.challenge.pokeinfo.AbilitiesResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.Ability;
import mx.com.bankaya.poke.challenge.pokeinfo.AbilityDetail;
import mx.com.bankaya.poke.challenge.pokeinfo.BaseExperienceResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.HeldItem;
import mx.com.bankaya.poke.challenge.pokeinfo.HeldItemsResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.IdResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.Item;
import mx.com.bankaya.poke.challenge.pokeinfo.LocationAreaEncountersResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.NameResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.Version;
import mx.com.bankaya.poke.challenge.pokeinfo.VersionDetail;
import mx.com.bankaya.poke.challenge.repository.EventRepository;
import mx.com.bankaya.poke.challenge.service.ConsumeService;
import mx.com.bankaya.poke.challenge.service.PokeService;

@Service
public class PokeServiceImpl implements PokeService {
	
	@Value("${pokeapi.url}")
	private String pokeApiUrl;
	
	@Autowired
	private EventRepository repository;
	
	@Autowired
	private ConsumeService consume;
	
	@Autowired
	private HttpServletRequest request;
	
	@Override
	public AbilitiesResponse getAbilities(String name) throws ParseException {
		Pokemon pokemon = registryMethod(name, Method.ABILITIES);
		AbilitiesResponse response = new AbilitiesResponse();
		List<Ability> abilities = pokemon.getAbilities().parallelStream().collect(
				ArrayList<Ability>::new, 
				(list, el) -> {
					Ability_ elAbility = el.getAbility();
					AbilityDetail abilityDetail = new AbilityDetail();
					abilityDetail.setName(elAbility.getName());
					abilityDetail.setUrl(elAbility.getUrl());
					Ability ability = new Ability();
					ability.setIsHidden(el.getIsHidden());
					ability.setSlot(el.getSlot());
					ability.setAbility(abilityDetail);
					list.add(ability);
				},
				(list1, list2) -> {
					list1.addAll(list2);
				});
		response.getAbilities().addAll(abilities);
		return response;
	}

	@Override
	public BaseExperienceResponse getBaseExperience(String name) throws ParseException {
		Pokemon pokemon = registryMethod(name, Method.BASE_EXPERIENCE);
		BaseExperienceResponse response = new BaseExperienceResponse();
		response.setBaseExperience(pokemon.getBaseExperience());
		return response;
	}

	@Override
	public HeldItemsResponse getHeldItems(String name) throws ParseException {
		Pokemon pokemon = registryMethod(name, Method.HELD_ITEMS);
		List<HeldItem> heldItems = pokemon.getHeldItems().parallelStream().collect(
				ArrayList<HeldItem>::new,
				(list, el) -> {
					mx.com.bankaya.poke.challenge.pokeapi.Item elItem = el.getItem();
					Item item = new Item();
					item.setName(elItem.getName());
					item.setUrl(elItem.getUrl());
					HeldItem heldItem = new HeldItem();
					heldItem.setItem(item);
					List<VersionDetail> versionDetails = el.getVersionDetails().parallelStream().collect(
							ArrayList<VersionDetail>::new,
							(subList, subEl) -> {
								Version_ versionEl = subEl.getVersion();
								Version version = new Version();
								version.setName(versionEl.getName());
								version.setUrl(versionEl.getUrl());
								VersionDetail versionDetail = new VersionDetail();
								versionDetail.setRarity(subEl.getRarity());
								versionDetail.setVersion(version);
								subList.add(versionDetail);
							},
							(list1, list2) -> {
								list1.addAll(list2);
							});
					heldItem.getVersionDetails().addAll(versionDetails);
					list.add(heldItem);
				},
				(list1, list2) -> {
					list1.addAll(list2);
				});
		HeldItemsResponse response = new HeldItemsResponse();
		response.getHeldItems().addAll(heldItems);
		return response;
	}

	@Override
	public IdResponse getId(String name) throws ParseException {
		Pokemon pokemon = registryMethod(name, Method.ID);
		IdResponse response = new IdResponse();
		response.setId(pokemon.getId());
		return response;
	}

	@Override
	public NameResponse getName(String name) throws ParseException {
		Pokemon pokemon = registryMethod(name, Method.NAME);
		NameResponse response = new NameResponse();
		response.setName(pokemon.getName());
		return response;
	}

	@Override
	public LocationAreaEncountersResponse getLocationAreaEncounters(String name) throws ParseException {
		Pokemon pokemon = registryMethod(name, Method.LOCATION_AREA_ENCOUNTERS);
		LocationAreaEncountersResponse response = new LocationAreaEncountersResponse();
		response.setLocationAreaEncounters(pokemon.getLocationAreaEncounters());
		return response;
	}
	
	private Pokemon registryMethod(String name, String method) throws ParseException {
		Event event = new Event().builder()
				.date(date())
				.ip(request.getRemoteAddr())
				.method(method)
				.build();
		repository.save(event);
		Pokemon pokemon = null;
		try {
			pokemon = consume.execute(pokeApiUrl + name, Pokemon.class, HttpMethod.GET);
		} catch(Exception e) {
			throw new PokemonException("POKEMON \"" + name + "\" NOT FOUND");
		}
		return pokemon;
	}
	
	private Timestamp date() throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String timeString = df.format(System.currentTimeMillis());
		Date date = df.parse(timeString);
		return new Timestamp(date.getTime());
	}

}

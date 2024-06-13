package mx.com.bankaya.poke.challenge.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mx.com.bankaya.poke.challenge.exception.PokemonException;
import mx.com.bankaya.poke.challenge.pokeinfo.AbilitiesResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.BaseExperienceResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.HeldItemsResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.IdResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.LocationAreaEncountersResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.NameResponse;

@SpringBootTest
public class PokeServiceTest {

	@Autowired
	private PokeService service;
	
	private final String pokemon = "ditto";
	
	@Test
	public void abilities() {
		try {
			AbilitiesResponse response = service.getAbilities(pokemon);
			assertTrue(!response.getAbilities().isEmpty());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void baseExperience() {
		try {
			BaseExperienceResponse response = service.getBaseExperience(pokemon);
			assertTrue(response.getBaseExperience() > 0);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void heldItems() {
		try {
			HeldItemsResponse response = service.getHeldItems(pokemon);
			assertTrue(!response.getHeldItems().isEmpty());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void id() {
		try {
			IdResponse response = service.getId(pokemon);
			assertTrue(response.getId() == 132);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void name() {
		try {
			NameResponse response = service.getName(pokemon);
			assertTrue(response.getName().equals(pokemon));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void locationAreaEncounters() {
		try {
			LocationAreaEncountersResponse response = service.getLocationAreaEncounters(pokemon);
			assertTrue(!response.getLocationAreaEncounters().isEmpty());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void pokemonNotFound() {
		try {
			AbilitiesResponse response = service.getAbilities("dittos");
			assertTrue(!response.getAbilities().isEmpty());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PokemonException e) {
			// TODO Auto-generated catch block
			assertTrue(true);
		}
	}
	
}

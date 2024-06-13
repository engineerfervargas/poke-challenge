package mx.com.bankaya.poke.challenge.service;

import java.text.ParseException;

import mx.com.bankaya.poke.challenge.pokeinfo.AbilitiesResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.BaseExperienceResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.HeldItemsResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.IdResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.LocationAreaEncountersResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.NameResponse;

public interface PokeService {
	
	public AbilitiesResponse getAbilities(String name) throws ParseException;
	public BaseExperienceResponse getBaseExperience(String name) throws ParseException;
	public HeldItemsResponse getHeldItems(String name) throws ParseException;
	public IdResponse getId(String name) throws ParseException;
	public NameResponse getName(String name) throws ParseException;
	public LocationAreaEncountersResponse getLocationAreaEncounters(String name) throws ParseException;
		
}

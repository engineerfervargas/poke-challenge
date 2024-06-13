package mx.com.bankaya.poke.challenge.endpoint;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.com.bankaya.poke.challenge.pokeinfo.AbilitiesRequest;
import mx.com.bankaya.poke.challenge.pokeinfo.AbilitiesResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.BaseExperienceRequest;
import mx.com.bankaya.poke.challenge.pokeinfo.BaseExperienceResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.HeldItemsRequest;
import mx.com.bankaya.poke.challenge.pokeinfo.HeldItemsResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.IdRequest;
import mx.com.bankaya.poke.challenge.pokeinfo.IdResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.LocationAreaEncountersRequest;
import mx.com.bankaya.poke.challenge.pokeinfo.LocationAreaEncountersResponse;
import mx.com.bankaya.poke.challenge.pokeinfo.NameRequest;
import mx.com.bankaya.poke.challenge.pokeinfo.NameResponse;
import mx.com.bankaya.poke.challenge.service.PokeService;

@Endpoint
public class PokeInfoEndPoint {
	
	private static final String NAMESPACE_URI = "http://bankaya/pokeinfo";
	
	@Autowired
	private PokeService service;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "abilitiesRequest")
    @ResponsePayload
    public AbilitiesResponse getAbilities(@RequestPayload AbilitiesRequest request) throws ParseException {
		AbilitiesResponse response = service.getAbilities(request.getName());
        return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "baseExperienceRequest")
    @ResponsePayload
    public BaseExperienceResponse getBaseExperience(@RequestPayload BaseExperienceRequest request) throws ParseException {
		BaseExperienceResponse response = service.getBaseExperience(request.getName());
        return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "heldItemsRequest")
    @ResponsePayload
    public HeldItemsResponse getHeldItems(@RequestPayload HeldItemsRequest request) throws ParseException {
		HeldItemsResponse response = service.getHeldItems(request.getName());
        return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "idRequest")
    @ResponsePayload
    public IdResponse getId(@RequestPayload IdRequest request) throws ParseException {
		IdResponse response = service.getId(request.getName());
        return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "nameRequest")
    @ResponsePayload
    public NameResponse getName(@RequestPayload NameRequest request) throws ParseException {
		NameResponse response = service.getName(request.getName());
        return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "locationAreaEncountersRequest")
    @ResponsePayload
    public LocationAreaEncountersResponse getLocationAreaEncounters(@RequestPayload LocationAreaEncountersRequest request) throws ParseException {
		LocationAreaEncountersResponse response = service.getLocationAreaEncounters(request.getName());
        return response;
	}
	
}

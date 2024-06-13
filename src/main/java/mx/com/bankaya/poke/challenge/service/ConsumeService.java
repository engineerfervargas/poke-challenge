package mx.com.bankaya.poke.challenge.service;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumeService {
	
	@Transactional(readOnly = true)
	public <T,E> T execute(String url, Class<T> clazzResponse, HttpMethod httpMethod) {
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
	    RestTemplate rt = new RestTemplate();
		HttpEntity<E> requestPokeApi = new HttpEntity<>(headers);
		ResponseEntity<T> responsePokeApi;
		responsePokeApi = rt.exchange(url, httpMethod, requestPokeApi, clazzResponse);
		return responsePokeApi.getBody();
	}

}

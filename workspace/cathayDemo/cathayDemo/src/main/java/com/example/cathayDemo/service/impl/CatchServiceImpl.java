package com.example.cathayDemo.service.impl;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import com.example.cathayDemo.service.CatchService;


@Service
public class CatchServiceImpl implements CatchService {



	@Override
	public String search() {

		String coindeskAPI = "https://api.coindesk.com/v1/bpi/currentprice.json";
//		UriComponentsBuilder verifyBuilder = UriComponentsBuilder.fromHttpUrl(coindeskAPI);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		try {
//			return(new RestTemplate()).postForObject(verifyBuilder.build().encode().toUri(),request,String.class);
			return(new RestTemplate()).getForObject(coindeskAPI, String.class);
			
		}catch(RestClientResponseException e) {
		}
		return null;

	}

}


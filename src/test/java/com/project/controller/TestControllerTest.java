package com.project.controller;

import java.net.URI;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

class TestControllerTest {

	RestTemplate restTemplate;
	
	@BeforeEach
	void setUp() throws Exception {
		restTemplate = new RestTemplateBuilder()
							.build();
	}

	@Test
	void test() throws Exception {
		
		RequestEntity<?> requestEntity = RequestEntity
											.get(URI.create("http://localhost:8000/test"))
											.accept(MediaType.APPLICATION_JSON)
											.build();
		
		ResponseEntity<String> responseEntity = restTemplate.exchange(requestEntity, String.class);
		HttpStatus httpStatus = responseEntity.getStatusCode();
		if(httpStatus != HttpStatus.OK) {
			throw new Exception("GET FAIL :: Status :: " + httpStatus);
		}
		String result = responseEntity.getBody();
		System.out.println(result);
	}
}

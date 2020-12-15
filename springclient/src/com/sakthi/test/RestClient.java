package com.sakthi.test;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {

	private String server = "http://localhost:9090";
	private RestTemplate rest;
	private HttpHeaders headers;
	private HttpStatus status;

	public RestClient() {
		this.rest = new RestTemplate();
		this.headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Accept", "*/*");
	}

	public String get(String uri) {
		HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
		ResponseEntity<String> responseEntity = rest.exchange(server + uri, HttpMethod.GET, requestEntity,
				String.class);
		this.setStatus(responseEntity.getStatusCode());
		return responseEntity.getBody();
	}

	public String post(String uri, String json) {
		HttpEntity<String> requestEntity = new HttpEntity<String>(json, headers);
		ResponseEntity<String> responseEntity = rest.exchange(server + uri, HttpMethod.POST, requestEntity,
				String.class);
		this.setStatus(responseEntity.getStatusCode());
		return responseEntity.getBody();
	}

	public static void main(String[] args) {

		RestClient c = new RestClient();
		
		//  String data = c.get("/user/welcome"); System.out.println("DATA : \n" + data);
		
		/*
		 * User u = new User(); u.setFirstName("Sakthi"); u.setLastName("vel");
		 * u.setEmail("sakthi@gmail.com"); u.setUserName("sa"); u.setPassword("123");
		 * u.setActive(true); u.setCountry("IN");
		 * 
		 * Address a = new Address(); a.setAddress("Kengeri"); a.setType("Home");
		 * 
		 * Set<Address> addresses = new HashSet<Address>(); addresses.add(a);
		 * u.setAddresses(addresses);
		 * 
		 * Set<Address> ad = new HashSet<Address>(); ad.add(a); u.setAddresses(ad);
		 * 
		 * ObjectMapper mapper = new ObjectMapper(); String json = ""; try { json =
		 * mapper.writeValueAsString(u); } catch (JsonProcessingException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		//String json = "{\"firstName\":\"h\",\"lastName\":\"fgh\",\"mobile\":\"5678\",\"email\":\"dfgh\",\"role\":{\"name\":\"fg\",\"description\":\"fdg\"}}";
		String json = "{\"firstName\":\"Sakthi\",\"lastName\":\"vel\",\"mobile\":\"5678\",\"email\":\"dfgh\",\"role\":{\"name\":\"SDE\",\"description\":\"Level 2\"},\"addresses\":[{\"type\":\"HOME\",\"address\":\"ADD1\"},{\"type\":\"OFFICE\",\"address\":\"ADD2\"}]}";
		String data = c.post("/save", json);
		 
		System.out.println("DATA : \n" + data);
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
}

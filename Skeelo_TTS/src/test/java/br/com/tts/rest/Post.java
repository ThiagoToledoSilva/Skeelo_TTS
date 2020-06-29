package br.com.tts.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class Post {
	
	@Test
	public void userPost() {
		
		given()
			.log().all()
			.contentType("application/json")
			.body("{\r\n" + 
					"  \"name\": \"Thiago Toledo\",\r\n" + 
					"  \"username\": \"TTS\",\r\n" + 
					"  \"email\": \"thiagotol@gmail.com\",\r\n" + 
					"  \"address\": {\r\n" + 
					"    \"street\": \"Rua 1\",\r\n" + 
					"    \"suite\": \"Apt. 123\",\r\n" + 
					"    \"city\": \"São Paulo\",\r\n" + 
					"    \"zipcode\": \"04567-1456\",\r\n" + 
					"    \"geo\": {\r\n" + 
					"      \"lat\": \"-36.1234\",\r\n" + 
					"      \"lng\": \"81.5678\"\r\n" + 
					"    }\r\n" + 
					"  },\r\n" + 
					"  \"phone\": \"1-771-732-98289 6521\",\r\n" + 
					"  \"website\": \"tts.org\",\r\n" + 
					"  \"company\": {\r\n" + 
					"    \"name\": \"tts\",\r\n" + 
					"    \"catchPhrase\": \"Multi-layered client-server neural-net\",\r\n" + 
					"    \"bs\": \"harness real-time e-markets\"\r\n" + 
					"  }\r\n" + 
					"}")
		.when()
			.post("http://jsonplaceholder.typicode.com/users")
		.then()
			.log().all()
			.statusCode(201)
			.body("name", is("Thiago Toledo"))
			;
	}
}


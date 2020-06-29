package br.com.tts.rest;

import static io.restassured.RestAssured.given;

import org.junit.Test;

public class Delete {
	
	@Test
	public void userDelete() {
		
		given()
			.log().all()
		.when()
			.delete("http://jsonplaceholder.typicode.com/users/1")
		.then()
			.log().all()
			.statusCode(204)
			;
	}
}


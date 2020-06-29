package br.com.tts.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class Get {
	
	@Test
	public void userGet() {
		
		given()
			.log().all()
		.when()
			.get("http://jsonplaceholder.typicode.com/users/1")
		.then()
			.statusCode(200)
			.body("id", is(1))
			.body("name", containsString("Leanne Graham"))
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("users.json"))
			;
	}
}

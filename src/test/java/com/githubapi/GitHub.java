package com.githubapi;

import io.restassured.RestAssured;

public class GitHub {
	
	public static void CreateGitRepo() {
		
		RestAssured.given()
		                .baseUri("https://api.github.com")
		                .headers("")
      
	}

}

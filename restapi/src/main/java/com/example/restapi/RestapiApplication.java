package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication {

	public static void main(String[] args) {
//		Initiates the project based on Spring
		SpringApplication.run(RestapiApplication.class, args);
		System.out.println("@@App Started");
	}

}

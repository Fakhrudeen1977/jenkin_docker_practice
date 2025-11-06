package com.moh.gov.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkin_DockerController {

	@GetMapping("/createDockerImage")
	public ResponseEntity<String>  createDockerImage (){
		String message="<h1>Welcome to Spring Boot</h1>";
		return new ResponseEntity<String>(message,HttpStatus.OK);
		
	}
}

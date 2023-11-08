package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ud23Primero2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ud23Primero2Application.class, args);
	}
	@GetMapping ("/")
	public String inicio() {		
		return "Hola mundo";
	}
	@GetMapping ("/home")
		public String home () {
			return String.format("/home");
		}
}

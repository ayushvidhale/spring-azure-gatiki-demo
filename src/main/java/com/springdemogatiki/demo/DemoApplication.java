package com.springdemogatiki.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/message")
	public String message(){
		return "Congo!! Spring Boot project deplopoyed successfully...."
	}
	@GetMapping("/")
	public String message(){
		return "This is your root webpage...."
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

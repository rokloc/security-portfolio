package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPracticeApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
		return "Hello, Spring Boot 3!!!";
	}
	@RequestMapping("/{str}")
	public String str(@PathVariable String str) {
		return "Hello," + str + "!!!";
	}
	
	

}


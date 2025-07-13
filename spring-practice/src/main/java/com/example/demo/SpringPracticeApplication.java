package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPracticeApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringPracticeApplication.class, args);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//RestController
	/*
	List<String> list = new ArrayList<>(Arrays.asList("aaaaa", "bbbbb", "ccccc"));

	public static void main(String[] args) {
		SpringApplication.run(SpringPracticeApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
		return "Hello, Spring Boot 3!!!";
	}
	@RequestMapping("/str/{str}")
	public String str(@PathVariable String str) {
		return "Hello," + str + "!!!";
	}
	@RequestMapping("/num/{num}")
	public String str(@PathVariable int num) {
		return "Hello," + list.get(num) + "!!!";
	}
	*/
}


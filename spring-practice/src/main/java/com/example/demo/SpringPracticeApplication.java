package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPracticeApplication {
	//
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
	
	

}


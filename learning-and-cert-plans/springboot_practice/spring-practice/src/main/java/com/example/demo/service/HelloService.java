package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	
	public List<String> getService(){
		return Arrays.asList("こんにちは！", "Spring Bootは楽しい", "Security+も頑張ろう🔥");
	}
	
}

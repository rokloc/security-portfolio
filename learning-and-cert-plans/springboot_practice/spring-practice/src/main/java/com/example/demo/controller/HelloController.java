package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.HelloService;

@Controller
public class HelloController {
	
	private final HelloService service;
	
	//コンストラクタ DIでサービスのインスタンスを受け取る
	public HelloController(HelloService service) {
		this.service = service;
	}
	
	//to View
	@GetMapping("/")
	public String TopPage(Model model) {
		model.addAttribute("messages", service.getService());
		return "index";
	}


}


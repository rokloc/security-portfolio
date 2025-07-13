package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HelloController {

	@GetMapping("/")
	public String TopPage(Model model) {
		model.addAttribute("msg", "名前を入力して");
		return "index";
	}
	
	@PostMapping("/other")
	public String OtherPage(@RequestParam String username,  Model model) {
		model.addAttribute("hello", "こんにちは" + username + "さん");
		return "other";
	}

}

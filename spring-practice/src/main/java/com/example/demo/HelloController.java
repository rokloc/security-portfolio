package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	/*
	裏でDIコンテナがModelインターフェースを継承したクラスのインスタンスを
	newして保管している。それを仮引数のmodelにポリモーフィズムの要領で代入してくれている
	これをDI（依存性注入）といい、Springの代表的な特徴のひとつ
	*/
	@RequestMapping
	public String index(Model model) { 
		model.addAttribute("msg", "これはコントローラーに用意したメッセージです");
		return "index";
	}
	
	
	
	
	
//	@RequestMapping("/")
//	public String topPage() {
//		return ("index");
//	}
//	@RequestMapping("/other")
//	public String otherPage() {
//		return ("other");
//	}

}

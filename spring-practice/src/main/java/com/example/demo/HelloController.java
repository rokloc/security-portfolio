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
		//テンプレートエンジンはModelの中身を辞書のように見ることができる
		//ModelはMapのようにキーと値を保持
		model.addAttribute("msg1", "Model_1");
		model.addAttribute("msg2", "Model_2");
		model.addAttribute("msg3", "Model_3");
		model.addAttribute("msg4", "Model_4");
		model.addAttribute("msg5", "Model_5");

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

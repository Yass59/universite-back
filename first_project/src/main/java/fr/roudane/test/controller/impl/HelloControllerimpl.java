package fr.roudane.test.controller.impl;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.roudane.test.controller.IHelloController;
@Controller
public class HelloControllerimpl implements IHelloController{

	@Override
	@RequestMapping ("/hello")
	public String direHello(Map<String, Object> model) {
		// TODO Auto-generated method stub
		return "hello";
	}

	@Override
	@RequestMapping ("/test")
	public String test(Map<String, Object> model) {
		// TODO Auto-generated method stub
		return "test";
	}

	@Override
	@RequestMapping ("/spring")
	public String spring(Map<String, Object> model) {
		String titre = "Spring Framework";
		int agefabrice = 37;
		boolean b = true;
	model.put("titre", titre);
	model.put("cle", "123");
	model.put("fab", agefabrice);
	model.put("vrai", b);
	
		return "spring";
	}

	
	
	
}

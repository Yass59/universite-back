package fr.roudane.test.controller.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.roudane.test.controller.IgoodController;
@Controller
public class GoodController implements IgoodController{

	@Override
	@RequestMapping ("/bonjour")
	public String bonjour(Model model) {
	String nom = "jackj";
	String titre = "Spring Framework";
	int agefabrice = 37;
	boolean b = true;
	int nombre = 100;
	model.addAttribute("nombre", nombre);
	model.addAttribute("nom", nom);
	model.addAttribute("agefabrice", agefabrice);
	model.addAttribute("vrai", b);
	model.addAttribute("titre", titre);
	
	
		return "bonjourPage";
	}

	@Override
	@RequestMapping ("/boucle")
	public String boucle(Model model) {
		ArrayList<String> noms = new ArrayList<>();
		noms.add("james");
		noms.add("jack");
		noms.add("thomas");
		noms.add("eric");
		noms.add("yass");
		noms.add("mohamed");
		
		model.addAttribute("lesnoms", noms);
		
		return "boucle";
	}

}

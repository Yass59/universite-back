package fr.roudane.test.controller.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.roudane.test.controller.IUtilisateurController;
import fr.roudane.test.domain.Utilisateur;
import fr.roudane.test.service.impl.UtilisateurService;
@Controller
public class UtilisateurController implements IUtilisateurController {

	
@Autowired
UtilisateurService us;
	@Override
	@RequestMapping ("/utilisateurs")
	public String getUtilisateurs(Model model) {
		ArrayList<Utilisateur> liste = us.getAllusers();
		model.addAttribute("listeutilisateur", liste);
		


		return "utilisateur";
	}
	@Override
	@RequestMapping ("/user")
	public String getUser(Model model) {
		Utilisateur user = us.getOneUser();
		model.addAttribute("user", user);
		return "user";
	}



	
	
}

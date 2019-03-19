package fr.roudane.utilisateur.controller.impl;

import java.util.List;

import javax.xml.ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import fr.roudane.utilisateur.controller.IUtilisateurController;
import fr.roudane.utilisateur.domain.Utilisateur;
import fr.roudane.utilisateur.service.impl.UtilisateurService;
@Controller
public class UtilisateurController implements IUtilisateurController {
	@Autowired
	UtilisateurService UtilisateurService;
	@Override
	@RequestMapping("/users")
	public String getUtilisateurs(Model model) {

		List<Utilisateur>liste = UtilisateurService.findallusers();
		model.addAttribute("users",liste);




		return "Utilisateur";
	}
	
	@Override
	@RequestMapping("/utilisateur-info")
	public String InfoUtilisateur(Model model, @RequestParam("id")    Integer id) {
		Utilisateur user = UtilisateurService.findOneUser(id);
		model.addAttribute("user", user);



		return "utilisateur-info";
	}
	@RequestMapping ("/supprimer")
	@Override
	public String supprimerUtilisateur(Model model,  @RequestParam ("id") Integer id) {
UtilisateurService.supprimer(id);
		return "redirect:/users";
	}

	@Override
	@GetMapping("/ajouter")
	
	
	public String ajouterutilisateur(Model model) {
		Utilisateur u = new Utilisateur();
		model.addAttribute("u",u);
		return "ajouterutilisateur";
	}

	@Override
	@PostMapping("ajouter-user")
	public String ajouterutilisateurValidation(Model model, @ModelAttribute Utilisateur u) {
	
		UtilisateurService.AjouterUtilisater(u);
		
		
		return  "redirect:/users";
	}

	@Override
	@GetMapping("/modifier")
	public String modifierFormulaire(Model model, @RequestParam("id") Integer id) {

		Utilisateur u = UtilisateurService.findOneUser(id);
		model.addAttribute("u",u);
		
		return "modifier";
	}

	@Override
	public String validerUtilisater(Model model, @ModelAttribute Utilisateur u) {
	
		
		UtilisateurService.modifierUtilisater(u);
		
		return "redirect:/users";
	}

	

}

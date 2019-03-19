package fr.roudane.universite.etudiant.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.roudane.universite.etudiant.controller.IetudiantController;
import fr.roudane.universite.etudiant.domain.EtudiantBean;
import fr.roudane.universite.etudiant.service.impl.EtudiantService;
@Controller
public class EtudiantController implements IetudiantController{

	@Autowired EtudiantService etudiantservice;
	
	
	
	
	
	
	@Override
	@GetMapping("/etudiant")
	public String getEtudiant(Model model) {
		
			List<EtudiantBean>etudiant = etudiantservice.getall();
		
		model.addAttribute("e", etudiant);
		
		
		
		
		
		return "/etudiant/etudiant";
	}






	@Override
	@GetMapping ("/etudiantinfo")
	public String getONEetudiant(Model model, Integer id) {
	
		EtudiantBean et = etudiantservice.getone(id);
		
		
		model.addAttribute("e", et);
		
		
		return "etudiant/etudiantinfo";
		
	}






	@Override
	@GetMapping("/modifetudiant")
	public String modifetudiant(Model model, @RequestParam Integer id) {
	
		
		
		
		EtudiantBean e = etudiantservice.getone(id);
		
		model.addAttribute("e", e);
		
		
		
		
		
		
		
		
		return "etudiant/etudiantmodif";
	}






	@Override
	@PostMapping("/modifvalid")
	public String validationmodif(Model model, EtudiantBean e) {
		
		
		
etudiantservice.ajoutetudiant(e);


if(e == null) {
	return "redirect:/modifetudiant";
}
else {
return "redirect:/etudiant";
	
	}

}






	@Override
	@GetMapping("/ajouteretudiant")
	public String ajouteretudiant(Model model) {
	
		EtudiantBean e = new EtudiantBean()
;
		model.addAttribute("e", e);
		
		
		
		
		
		
		
		
		return "etudiant/etudiantajout";
	}






	@Override
	@PostMapping("/ajout-etudiant")
	public String validationajout(Model model, EtudiantBean e) {

		etudiantservice.ajoutetudiant(e);
		
		
		
		
		
		
		if(e == null) {
			return "redirect:/ajouteretudiant";
		}
		else {
		return "redirect:/etudiant";
	}
		
	
	}






	@Override
	@GetMapping("/suppression")
	public String supprimeretudiant(Model model, Integer id) {
		
		
		
		etudiantservice.supression(id);
		
		
		
		
		
		
		return "redirect:/etudiant";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
package fr.roudane.universite.enseignant.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.roudane.universite.enseignant.controller.IenseignantController;
import fr.roudane.universite.enseignant.domain.EnseignantBean;
import fr.roudane.universite.enseignant.service.impl.EnseignantService;
@Controller
public class EnseignantController implements IenseignantController{
	Logger log = LoggerFactory.getLogger(EnseignantController.class);
	@Autowired EnseignantService enseignantservice;

	@Override
	@GetMapping("/enseignant")
	public String getEnseignant(Model model) {
	
		
		List<EnseignantBean>enseignant = enseignantservice.Findall();
		model.addAttribute("e", enseignant);
		
		
		return "enseignant/enseignant";
	}

	@Override
	@GetMapping("/enseignantinfo")
	public String enseignantInfos(Model model, Integer id) {
		
	EnseignantBean e = enseignantservice.getone(id);
		model.addAttribute("e", e);
		
		return "enseignant/enseignantinfo";
	}

	@Override
	@GetMapping("/ajoutenseignant")
	public String ajouterenseignant(Model model) {
	
		EnseignantBean e = new EnseignantBean();
		model.addAttribute("e", e);
		
		
		return "enseignant/ajoutenseignant";
	}

	@Override
	@PostMapping("/ajouter-enseignant")
	public String validationajout(Model model, EnseignantBean e) {
		log.info("nom enseignant : {}" + e.getNom());
		EnseignantBean en = enseignantservice.ajouter(e);
		if(en == null) {
			return "redirect:/ajoutenseignant";
		}
		else {
		return "redirect:/enseignant";
	}
	
	
	
	
	}

	@Override
	@GetMapping("/modif")
	public String modifenseignant(Model model, Integer id) {
		
		EnseignantBean e = enseignantservice.getone(id);
		model.addAttribute("e", e);
		
		
		
		return "enseignant/modifenseignant";
	}

	@Override
	@PostMapping("modification-enseignant")
	public String validationmodif(Model model, EnseignantBean e) {
	
		enseignantservice.ajouter(e);
		
		if(e == null) {
			return "redirect:/modif";
		}
		else {
		return "redirect:/enseignant";
	}
		
	
	}

	@Override
	@GetMapping("/supprimer")
	public String supprimerenseignant(Model model, Integer id) {
		
		enseignantservice.supprimer(id);
		
		
		
		return "redirect:/enseignant";
	}
	
	
	
	
	
	
	
	
}

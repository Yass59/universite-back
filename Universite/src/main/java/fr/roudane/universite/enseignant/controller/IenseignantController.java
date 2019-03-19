package fr.roudane.universite.enseignant.controller;

import org.springframework.ui.Model;

import fr.roudane.universite.enseignant.domain.EnseignantBean;

public interface IenseignantController {

	
	
	
	public String getEnseignant (Model model);
	
	public String enseignantInfos (Model model, Integer id);
	
	public String ajouterenseignant (Model model);
	
	
	public String validationajout (Model model, EnseignantBean e);
	
	
	
	public String modifenseignant (Model model , Integer id);
	
	
	public String validationmodif (Model model, EnseignantBean e);
	
	public String supprimerenseignant (Model model, Integer id);
	
}

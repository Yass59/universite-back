package fr.roudane.universite.etudiant.controller;

import org.springframework.ui.Model;

import fr.roudane.universite.etudiant.domain.EtudiantBean;

public interface IetudiantController {

	
	
	
	public String getEtudiant(Model model);
	
	public String getONEetudiant(Model model , Integer id);
	
	
	public String modifetudiant(Model model, Integer id);
	
	
	public String validationmodif (Model model, EtudiantBean e);
	
	
	public String ajouteretudiant (Model model);
	
	
	
	public String validationajout (Model model, EtudiantBean e);
	
	
	
	public String supprimeretudiant (Model model , Integer id);
	
	
	
}

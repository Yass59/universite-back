package fr.roudane.universite.matiere.service;

import java.util.List;

import fr.roudane.universite.matiere.domain.matierebean;

public interface ImatiereService {

	
	
	
	
	public List<matierebean>getall();
	
	public matierebean findone (Integer id);
	
	public matierebean ajoutermatiere (matierebean m);
	
	public matierebean modifmatiere(matierebean m);
	
	
	
	
	
	
}

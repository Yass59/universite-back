package fr.roudane.universite.enseignant.service;

import java.util.List;

import fr.roudane.universite.enseignant.domain.EnseignantBean;

public interface IenseignantService {

	
	
	public List<EnseignantBean>Findall();
	public EnseignantBean getone(Integer id);

	public EnseignantBean ajouter(EnseignantBean enseignant);
	
	
	
	public EnseignantBean modifenseignant (EnseignantBean enseignant);
	
	public void supprimer (Integer id);
	
	
}

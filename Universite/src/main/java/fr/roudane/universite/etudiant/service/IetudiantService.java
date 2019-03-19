package fr.roudane.universite.etudiant.service;

import java.util.List;

import fr.roudane.universite.etudiant.domain.EtudiantBean;

public interface IetudiantService {

	
	
	
	public List<EtudiantBean>getall();
	
	public  EtudiantBean getone(Integer id);
	
	public EtudiantBean modifetudiant(EtudiantBean etudiant);
	
public EtudiantBean ajoutetudiant (EtudiantBean etudiant);
	
	
	public void supression (Integer id);
	
	
	
}

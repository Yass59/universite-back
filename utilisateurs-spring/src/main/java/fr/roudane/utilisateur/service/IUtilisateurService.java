package fr.roudane.utilisateur.service;


import java.util.List;

import fr.roudane.utilisateur.domain.Utilisateur;

public interface IUtilisateurService {
	
	
	
	
	public List<Utilisateur>findallusers();
	
	public Utilisateur findOneUser(Integer id);
	
	public void supprimer(Integer id);
	
	public void AjouterUtilisater(Utilisateur user);
	
	public void modifierUtilisater(Utilisateur user);
	
	
}

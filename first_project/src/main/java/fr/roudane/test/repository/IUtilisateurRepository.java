package fr.roudane.test.repository;

import java.util.ArrayList;

import fr.roudane.test.domain.Utilisateur;

public interface IUtilisateurRepository {

	
	public ArrayList<Utilisateur>getAllusers();
	public Utilisateur getOneUser();
}

package fr.roudane.test.repository.impl;

import java.util.ArrayList;

import fr.roudane.test.domain.Utilisateur;
import fr.roudane.test.repository.IUtilisateurRepository;

public class UtilisateurRepositoryimpl implements IUtilisateurRepository {

	@Override
	public ArrayList<Utilisateur> getAllusers() {
ArrayList<Utilisateur>liste = new ArrayList<>();
		
		Utilisateur u1 = new Utilisateur("james", "h", 41);
		Utilisateur u2 = new Utilisateur("jack", "k", 61);
		Utilisateur u3 = new Utilisateur("john", "s", 42);
		Utilisateur u4 = new Utilisateur("franck", "kl", 71);
		
		liste.add(u1);
		liste.add(u2);
		liste.add(u3);
		liste.add(u4);
		
		return liste;
	}

	@Override
	public Utilisateur getOneUser() {
		Utilisateur u = new Utilisateur("fabrice", "dirtrally", 37);
		return u;
	}

}

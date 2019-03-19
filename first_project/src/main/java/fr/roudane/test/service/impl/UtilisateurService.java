package fr.roudane.test.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.roudane.test.domain.Utilisateur;
import fr.roudane.test.repository.impl.UtilisateurRepositoryimpl;
import fr.roudane.test.service.IUtilisateurService;
@Service
public class UtilisateurService implements IUtilisateurService {

	
	@Autowired
	UtilisateurRepositoryimpl utilisateurRepository;
	
	
	@Override
	public ArrayList<Utilisateur> getAllusers() {
		ArrayList<Utilisateur>liste = utilisateurRepository.getAllusers();
		return liste;
	}

	@Override
	public Utilisateur getOneUser() {
		Utilisateur u = new Utilisateur("fabrice", "dirtrally", 37);
		return u;
	}

}

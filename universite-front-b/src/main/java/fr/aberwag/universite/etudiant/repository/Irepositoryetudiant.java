package fr.aberwag.universite.etudiant.repository;

import java.util.List;

import fr.aberwag.universite.etudiant.domain.Etudiant;

public interface Irepositoryetudiant {

	List<Etudiant> findAll();

	Etudiant getOne(Integer id);

	Etudiant save(Etudiant etudiant);

	void deleteById(Integer id);

	
}

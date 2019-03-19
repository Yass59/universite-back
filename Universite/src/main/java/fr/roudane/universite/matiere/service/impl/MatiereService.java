package fr.roudane.universite.matiere.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.roudane.universite.matiere.domain.matierebean;
import fr.roudane.universite.matiere.repository.ImatiereRepository;
import fr.roudane.universite.matiere.service.ImatiereService;
@Service
public class MatiereService implements ImatiereService{

	@Autowired ImatiereRepository matiererepository;
	
	
	
	
	
	@Override
	public List<matierebean> getall() {
		
		
		 List<matierebean>liste = matiererepository.findAll();
		
		
		
		
		
		
		
		
		return liste;
	}





	@Override
	public matierebean findone(Integer id) {
	
		matierebean m = matiererepository.getOne(id);
		
		
		return m;
	}





	@Override
	public matierebean ajoutermatiere(matierebean m) {

		matierebean mt = matiererepository.save(m);
		
		
		
		
		
		
		
		
		
		
		return mt;
	}





	@Override
	public matierebean modifmatiere(matierebean m) {

		matierebean mt = matiererepository.save(m);
		
		
		
		return mt;
	}

	
	
	
	
	
	
	
}
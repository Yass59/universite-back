package fr.roudane.universite.enseignant.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.roudane.universite.enseignant.domain.EnseignantBean;
import fr.roudane.universite.enseignant.repository.IEnseignanyRepository;
import fr.roudane.universite.enseignant.service.IenseignantService;
@Service
public class EnseignantService implements IenseignantService {
Logger log = LoggerFactory.getLogger(EnseignantService.class);
	@Autowired IEnseignanyRepository enseignantrepository;
	
	
	@Override
	public List<EnseignantBean> Findall() {

		List<EnseignantBean>listeenseignant = enseignantrepository.findAll();
		
		for(int i = 0; i <listeenseignant.size(); i++ ) {
			
			EnseignantBean e = listeenseignant.get(i);
			
			log.info("Image de l'enseignant :{}", e.getPhoto());
			
			if(e.getPhoto() == null || e.getPhoto().equals("")) {
				
				listeenseignant.get(i).setPhoto("https://thumbs.dreamstime.com/z/ic%C3%B4ne-d-einstein-professeur-logo-de-scientifique-120851850.jpg");
			}
			
			
			
		}
		
		return listeenseignant;
	}


	@Override
	public EnseignantBean getone(Integer id) {
	
		
		EnseignantBean e = enseignantrepository.getOne(id);
	
		if(e.getPhoto() == null || e.getPhoto().equals(""));

		{
			e.setPhoto("https://thumbs.dreamstime.com/z/ic%C3%B4ne-d-einstein-professeur-logo-de-scientifique-120851850.jpg");
		}
		
		
		
		
		
		return e;
	}




	@Override
	public EnseignantBean ajouter(EnseignantBean enseignant) {
	
		EnseignantBean e = enseignantrepository.save(enseignant);
		return e;
	}


	@Override
	public EnseignantBean modifenseignant(EnseignantBean enseignant) {
		
		
		
	EnseignantBean e =	 enseignantrepository.save(enseignant);
		
		
		return e;
	}


	@Override
	public void supprimer(Integer id) {
	
		enseignantrepository.deleteById(id);
		
		
	}


	




}

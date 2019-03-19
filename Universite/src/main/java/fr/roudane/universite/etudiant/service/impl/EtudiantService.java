package fr.roudane.universite.etudiant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.roudane.universite.enseignant.domain.EnseignantBean;
import fr.roudane.universite.etudiant.domain.EtudiantBean;
import fr.roudane.universite.etudiant.repository.IetudiantRepository;
import fr.roudane.universite.etudiant.service.IetudiantService;
@Service
public class EtudiantService implements IetudiantService{

	@Autowired IetudiantRepository etudiantrepository;
	
	
	
	
	@Override
	public List<EtudiantBean> getall() {

		List<EtudiantBean>listetudiant = etudiantrepository.findAll();
		
		
for(int i = 0; i <listetudiant.size(); i++ ) {
			
			EtudiantBean e = listetudiant.get(i);
			
			
			
			if(e.getPhoto() == null || e.getPhoto().equals("")) {
				
				listetudiant.get(i).setPhoto("https://previews.123rf.com/images/pikalvi/pikalvi1712/pikalvi171200312/93209150-conception-de-vecteur-d-ic%C3%B4ne-%C3%A9tudiant-conception-de-logo-d-%C3%A9tudiant-.jpg");
				
			}
		
		
		
		
	}
return listetudiant;
}




	@Override
	public EtudiantBean getone(Integer id) {
		
		
		
		

		EtudiantBean e = etudiantrepository.getOne(id);
	
		if(e.getPhoto() == null || e.getPhoto().equals(""));

		{
			e.setPhoto("https://previews.123rf.com/images/pikalvi/pikalvi1712/pikalvi171200364/93209307-logo-vectoriel-%C3%A9tudiant-forme-de-coeur-.jpg");
		}
		
		return e;
	}




	@Override
	public EtudiantBean modifetudiant(EtudiantBean etudiant) {
		
		
		
		EtudiantBean et = etudiantrepository.save(etudiant);
		
		
		
		
		
		return et;
	}




	@Override
	public EtudiantBean ajoutetudiant(EtudiantBean etudiant) {
		
		
		EtudiantBean e = etudiantrepository.save(etudiant);
		
		
		
		
		
		
		return e;
	}




	@Override
	public void supression(Integer id) {
		
		 etudiantrepository.deleteById(id);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

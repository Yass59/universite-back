package fr.aberwag.universite.etudiant.repository.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.aberwag.universite.etudiant.domain.Etudiant;
import fr.aberwag.universite.etudiant.repository.Irepositoryetudiant;
@Repository
public class EtudiantRepository implements Irepositoryetudiant {

	RestTemplate rest = new RestTemplate();
	
	public List<Etudiant> findAll() {
		
		
		List<Etudiant>listeetudiant = rest.exchange("http://localhost:8080/etudiants", HttpMethod.GET, null, new ParameterizedTypeReference <List<Etudiant>>(){}).getBody() ;
		
		
		
		
		
		
		
		return listeetudiant;
	}

	public Etudiant getOne(Integer id) {
		
		Etudiant en = rest.getForObject("http://localhost:8080/etudiants/" + id, Etudiant.class);
		
		
		
		return en;
	}

	public Etudiant save(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

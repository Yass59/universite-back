package fr.aberwag.universite.matiere.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.aberwag.universite.enseignant.domain.Enseignant;
import fr.aberwag.universite.note.domain.Note;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Matiere implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7289191633111638953L;


	private Integer id ;


	private Integer numero;

	
	private String nom;

	
	private Integer coef;

	
	private Enseignant enseignant;
	

	@JsonIgnore
	private List<Note> notes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCoef() {
		return coef;
	}

	public void setCoef(Integer coef) {
		this.coef = coef;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

}

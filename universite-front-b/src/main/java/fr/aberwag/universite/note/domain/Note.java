package fr.aberwag.universite.note.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.aberwag.universite.etudiant.domain.Etudiant;
import fr.aberwag.universite.matiere.domain.Matiere;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Note implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6631382376325308717L;


	private NotePK notePK;
	
	
	private Double note;
	
	
	private Etudiant etudiant;
	

	private Matiere matiere;

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}


	public Etudiant getEtudiant() {
		return etudiant;
	}


	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	public Matiere getMatiere() {
		return matiere;
	}


	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}


	public NotePK getNotePK() {
		return notePK;
	}


	public void setNotePK(NotePK notePK) {
		this.notePK = notePK;
	}
}
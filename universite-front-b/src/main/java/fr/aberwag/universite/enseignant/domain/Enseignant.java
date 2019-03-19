package fr.aberwag.universite.enseignant.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.aberwag.universite.matiere.domain.Matiere;



@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Enseignant implements Serializable
{
	private static final long serialVersionUID = 2276616332125157453L;

	
	private Integer id;
	

	private Integer numero;
	

	private String nom;
	

	private String prenom;
	
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateNaissance;
	
	
	private Character sexe;
	
	
	private String grade;
	
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateEmbauche;
	

	private String photo;
	

	@JsonIgnore
	private List<Matiere> matieres;
	
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Character getSexe() {
		return sexe;
	}
	public void setSexe(Character sexe) {
		this.sexe = sexe;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<Matiere> getMatieres() {
		return matieres;
	}
	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}
	
	
	
}

package fr.roudane.universite.enseignant.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import fr.roudane.universite.matiere.domain.matierebean;
@Entity()
@Table(name="enseignant")

public class EnseignantBean {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)



	@Column(name="id")
	private Integer id;
	@Column(name="numero")
	private Integer numero;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="date_de_naissance")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date datenaissance;
	@Column(name="sexe")
	private Character sexe;
	@Column(name="grade")
	private String grade;
	@Column(name="date_embauche")
	@DateTimeFormat(pattern="yyyy-MM-dd")

	private Date dateembauche;


	
	
	@Column(name="photo")
	private String photo;
	
	@OneToMany(mappedBy = "enseignant")
	private List<matierebean>listematiere;
	

	public List<matierebean> getListematiere() {
		return listematiere;
	}
	public void setListematiere(List<matierebean> listematiere) {
		this.listematiere = listematiere;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
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
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
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
	public Date getDateembauche() {
		return dateembauche;
	}
	public void setDateembauche(Date dateembauche) {
		this.dateembauche = dateembauche;
	}




}

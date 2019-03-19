package fr.roudane.universite.matiere.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.roudane.universite.enseignant.domain.EnseignantBean;
@Entity()
@Table(name="t_matiere")
public class matierebean {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	
	
	
	@Column(name= "id")
	private Integer id;  
	

	@Column(name= "numero_matiere")
	private Integer numero; 
	
	@Column(name="nom")
	private String nom;
	
	
	
	@Column(name="coef")
	private Integer coef;

	
	@ManyToOne
	@JoinColumn(name="id_enseignant")
	private EnseignantBean enseignant;
	
	
	
	
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

	

	public EnseignantBean getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(EnseignantBean enseignant) {
		this.enseignant = enseignant;
	}

	public Integer getCoef() {
		return coef;
	}

	public void setCoef(Integer coef) {
		this.coef = coef;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

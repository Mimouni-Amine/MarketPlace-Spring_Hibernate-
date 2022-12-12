package com.marketPlace.model;

import java.util.ArrayList;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="etudiant")
public class Etudiant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nom")
	@NotNull(message="le champ doit etre rempli")
	@Size(min=2 ,message="Minimum 2 charactere")
	@Size(max=8 ,message="maximum 8 charactere")
	private String nom;
	
	@Column(name="prenom")
	@NotNull(message="le champ doit etre rempli")
	@Size(min=2 ,message="Minimum 2 charactere")
	@Size(max=8 ,message="maximum 8 charactere")
	private String prenom;
	
	@Column(name="immatriculation")
	@NotNull(message="le champ doit etre rempli")
	@Pattern(regexp="[A-Z]{2}-[0-9]{3}-[A-Z]{2}", message="Immatriculation invalide") //Forme XX-999-XX
	private String immatriculation;
	
	
	
	
//	@Pattern(regexp = "^[12](0[1-9]|[1-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])([0-9]{6})$", message = "Incorrect format")
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Transient
	private Date birthDate;

	@Column(name="age")
	private String age;
	
	@Transient
	private LinkedHashMap<String,String> pays;
	@Transient
	private String paysChoisi;
	@Transient
	private ArrayList<String> matieres;
	

	
	public Etudiant(){
		this.matieres= new ArrayList<>();
		this.pays= new LinkedHashMap<>();
		this.pays.put("fr", "France");
		this.pays.put("it", "Italie");
		this.pays.put("jp", "Japan");
	
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



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public LinkedHashMap<String, String> getPays() {
		return pays;
	}



	public void setPays(LinkedHashMap<String, String> pays) {
		this.pays = pays;
	}



	public String getPaysChoisi() {
		return paysChoisi;
	}



	public void setPaysChoisi(String paysChoisi) {
		this.paysChoisi = paysChoisi;
	}



	public ArrayList<String> getMatieres() {
		return matieres;
	}



	public void setMatieres(ArrayList<String> matieres) {
		this.matieres = matieres;
	}



	public String getImmatriculation() {
		return immatriculation;
	}



	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}



	public Date getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}








	
	
}

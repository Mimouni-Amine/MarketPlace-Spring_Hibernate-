package com.marketPlace.model;

import java.io.FileWriter;

import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.Blob;
import java.util.List; 

import javax.persistence.CascadeType; 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="panier")
	private String panier;
	
	@Column(name="moyen_de_payement")
	private String moyen_de_payement;

	@OneToOne(mappedBy= "obj_client")
	private Utilisateur obj_utilisateur;
	
	
	public Client() {
		
	}
	
	
	
	public Client(String panier, String moyen_de_payement) {
		super();
		this.panier = panier;
		this.moyen_de_payement = moyen_de_payement;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPanier() {
		return panier;
	}

	public void setPanier(String panier) {
		this.panier = panier;
	}

	public String getMoyen_de_payement() {
		return moyen_de_payement;
	}

	public void setMoyen_de_payement(String moyen_de_payement) {
		this.moyen_de_payement = moyen_de_payement;
	}



	public Utilisateur getObj_utilisateur() {
		return obj_utilisateur;
	}



	public void setObj_utilisateur(Utilisateur obj_utilisateur) {
		this.obj_utilisateur = obj_utilisateur;
	}	
	
	
	
	
	
	
	
}

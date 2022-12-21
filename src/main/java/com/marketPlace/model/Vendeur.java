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
import javax.persistence.Transient;



@Entity
@Table(name="vendeur")
public class Vendeur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	

	
	@Column(name="inventaire")
	private String inventaire;
	
	@Column(name="historique")
	private String historique;
	

	@OneToOne(mappedBy= "obj_vendeur")
	private Utilisateur obj_utilisateur;
	

	@OneToMany(mappedBy= "obj_vendeur",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Inventaire> listInventaire;
	
	public Vendeur() {
		
	}
	
	
	public Vendeur(String inventaire, String historique) {
		super();
		this.inventaire = inventaire;
		this.historique = historique;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInventaire() {
		return inventaire;
	}

	public void setInventaire(String inventaire) {
		this.inventaire = inventaire;
	}

	public String getHistorique() {
		return historique;
	}

	public void setHistorique(String historique) {
		this.historique = historique;
	}

	public Utilisateur getObj_utilisateur() {
		return obj_utilisateur;
	}

	public void setObj_utilisateur(Utilisateur obj_utilisateur) {
		this.obj_utilisateur = obj_utilisateur;
	}


	public List<Inventaire> getListInventaire() {
		return listInventaire;
	}


	public void setListInventaire(List<Inventaire> listInventaire) {
		this.listInventaire = listInventaire;
	}	
	
	
	


	

	
	
}

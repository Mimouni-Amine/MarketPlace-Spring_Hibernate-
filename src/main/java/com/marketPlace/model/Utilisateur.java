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
@Table(name="utilisateur")
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="mot_de_passe")
	private String mot_de_passe;	
	
	@Column(name="nom")
	private String nom;

	@Column(name="prenom")
	private String prenom;
	
	@Column(name="numero")
	private String numero;	
	
	@Column(name="email")
	private String email;
	
	@Column(name="date_dinscription")
	private String date_dinscription;	
	
	@Column(name = "photo_de_profil")
	private Blob photo_de_profil;
	
	@Transient
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="client_id")
	private Client obj_client;
	
	@Transient
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="addresse_id")
	private Addresse obj_addresse;

	@Transient
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="vendeur_id")
	private Vendeur obj_vendeur;


	public Utilisateur() {
		
	}

	public Utilisateur(String user_name, String mot_de_passe, String nom, String prenom, String numero, String email) {
		super();
		this.user_name = user_name;
		this.mot_de_passe = mot_de_passe;
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.email = email;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getMot_de_passe() {
		return mot_de_passe;
	}

	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate_dinscription() {
		return date_dinscription;
	}

	public void setDate_dinscription(String date_dinscription) {
		this.date_dinscription = date_dinscription;
	}

	public Blob getPhoto_de_profil() {
		return photo_de_profil;
	}

	public void setPhoto_de_profil(Blob photo_de_profil) {
		this.photo_de_profil = photo_de_profil;
	}

	public Client getObj_client() {
		return obj_client;
	}

	public void setObj_client(Client obj_client) {
		this.obj_client = obj_client;
	}

	public Addresse getObj_addresse() {
		return obj_addresse;
	}

	public void setObj_addresse(Addresse obj_addresse) {
		this.obj_addresse = obj_addresse;
	}

	public Vendeur getObj_vendeur() {
		return obj_vendeur;
	}

	public void setObj_vendeur(Vendeur obj_vendeur) {
		this.obj_vendeur = obj_vendeur;
	}




	
	
	

	
	
}

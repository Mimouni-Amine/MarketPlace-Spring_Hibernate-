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
@Table(name="addresse")
public class Addresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	

	
	@Column(name="rue")
	private String rue;
	
	@Column(name="numero")
	private String numero;	
	
	@Column(name="code_postal")
	private String code_postal;

	@Column(name="ville")
	private String ville;
	
	
	@Column(name="pays")
	private String pays;

	
	
	
	public Addresse() {
		
	}
	

	public Addresse(String rue, String numero, String code_postal, String ville, String pays) {
		super();
		this.rue = rue;
		this.numero = numero;
		this.code_postal = code_postal;
		this.ville = ville;
		this.pays = pays;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCode_postal() {
		return code_postal;
	}


	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	


	

	
	
}

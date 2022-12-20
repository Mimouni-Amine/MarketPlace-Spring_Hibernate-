package com.marketPlace.model;

import java.util.HashMap;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import hibernate_project.Instructor;

@Entity
@Table(name="adresse")
public class AdresseNassim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private int id;
	
	@Column(name = "nom_rue")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private String nom_rue;
	
	
	@Column(name = "type_rue")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private String type_rue;
	
	
	@Column(name = "numero_rue")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private String numero_rue;
	
	@Column(name = "codepostale")
	@Pattern(regexp = "^(?:0[1-9]|[1-8]\\d|9[0-8])\\d{3}$")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private String codepostale;
	
	
	@Column(name = "ville")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private String ville;
	
	
	@Transient //C'est pas cet attribut
	private HashMap<String,String> pays;
	
	
	
	@Column(name = "pays")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private String payschoisie;
	
	@OneToOne(mappedBy="obj_addresse",cascade=CascadeType.ALL)
	private Utilisateur user;
	
	
	
	
	
	public AdresseNassim(int id,
			@NotNull(message = "les champ doit être rempli") @Size(min = 1, message = "le champ doit etre rempli") String nom_rue,
			@NotNull(message = "les champ doit être rempli") @Size(min = 1, message = "le champ doit etre rempli") String type_rue,
			@NotNull(message = "les champ doit être rempli") @Size(min = 1, message = "le champ doit etre rempli") String numero_rue,
			@Pattern(regexp = "^(?:0[1-9]|[1-8]\\d|9[0-8])\\d{3}$") @NotNull(message = "les champ doit être rempli") @Size(min = 1, message = "le champ doit etre rempli") String codepostale,
			@NotNull(message = "les champ doit être rempli") @Size(min = 1, message = "le champ doit etre rempli") String ville,
			HashMap<String, String> pays,
			@NotNull(message = "les champ doit être rempli") @Size(min = 1, message = "le champ doit etre rempli") String payschoisie) {
		super();
		this.id = id;
		this.nom_rue = nom_rue;
		this.type_rue = type_rue;
		this.numero_rue = numero_rue;
		this.codepostale = codepostale;
		this.ville = ville;
		this.pays = pays;
		this.payschoisie = payschoisie;
	}





	public AdresseNassim() {
		this.pays= new HashMap<>();
		this.pays.put("fr","france");
		this.pays.put("eng","angleterre");
		this.pays.put("ar","maroc");
		
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getNom_rue() {
		return nom_rue;
	}





	public void setNom_rue(String nom_rue) {
		this.nom_rue = nom_rue;
	}





	public String getType_rue() {
		return type_rue;
	}





	public void setType_rue(String type_rue) {
		this.type_rue = type_rue;
	}





	public String getNumero_rue() {
		return numero_rue;
	}





	public void setNumero_rue(String numero_rue) {
		this.numero_rue = numero_rue;
	}





	public String getCodepostale() {
		return codepostale;
	}





	public void setCodepostale(String codepostale) {
		this.codepostale = codepostale;
	}





	public String getVille() {
		return ville;
	}





	public void setVille(String ville) {
		this.ville = ville;
	}





	public HashMap<String, String> getPays() {
		return pays;
	}





	public void setPays(HashMap<String, String> pays) {
		this.pays = pays;
	}





	public String getPayschoisie() {
		return payschoisie;
	}





	public void setPayschoisie(String payschoisie) {
		this.payschoisie = payschoisie;
	}





	public Utilisateur getUser() {
		return user;
	}





	public void setUser(Utilisateur user) {
		this.user = user;
	}
	
	

	
	
	
	
	
	
}

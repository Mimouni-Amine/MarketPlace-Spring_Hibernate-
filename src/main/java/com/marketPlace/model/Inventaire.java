package com.marketPlace.model;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
@Table(name="inventaire")
public class Inventaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private int id;
	
    @OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="produit_id")
	private Produit prod;
	
    
    
	
	@Column(name = "quantité")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private int quantité;
	
	
	@ManyToOne(cascade=CascadeType.ALL, fetch= FetchType.LAZY)
	@JoinColumn(name="vendeur_id")
	private Vendeur obj_vendeur;


	
	
	

	public Inventaire() {
		super();
		// TODO Auto-generated constructor stub
	}










	public Inventaire(Produit prod,
			@NotNull(message = "les champ doit être rempli") @Size(min = 1, message = "le champ doit etre rempli") int quantité,
			Vendeur obj_vendeur) {
		super();
		this.prod = prod;
		this.quantité = quantité;
		this.obj_vendeur = obj_vendeur;
	}










	@Override
	public String toString() {
		return "Inventaire [id=" + id + ", prod=" + prod + ", quantité=" + quantité + ", obj_vendeur=" + obj_vendeur
				+ "]";
	}










	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public Produit getProduit_id() {
		return prod;
	}






	public void setProduit_id(Produit prod) {
		this.prod = prod;
	}






	public int getQuantité() {
		return quantité;
	}






	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}










	public Produit getProd() {
		return prod;
	}










	public void setProd(Produit prod) {
		this.prod = prod;
	}










	public Vendeur getObj_vendeur() {
		return obj_vendeur;
	}










	public void setObj_vendeur(Vendeur obj_vendeur) {
		this.obj_vendeur = obj_vendeur;
	}






	
	
	
	
	
	
	

}

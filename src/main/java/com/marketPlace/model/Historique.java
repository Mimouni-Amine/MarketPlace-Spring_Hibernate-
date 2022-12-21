package com.marketPlace.model;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="historique")
public class Historique {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="produit_id")
	private Produit produitId;
	
	@Column(name = "datedereception")
	private Date dateReception;
	
	@Column(name = "status")
	private boolean statut;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="client")
	private Client clientId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vendeur")
	private Vendeur vendeurId;

	public Historique() {
		super();
	}

	public Historique(int id, Produit produitId, Date dateReception, boolean statut, Client clientId,
			Vendeur vendeurId) {
		super();
		this.id = id;
		this.produitId = produitId;
		this.dateReception = dateReception;
		this.statut = statut;
		this.clientId = clientId;
		this.vendeurId = vendeurId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produit getProduitId() {
		return produitId;
	}

	public void setProduitId(Produit produitId) {
		this.produitId = produitId;
	}

	public Date getDateReception() {
		return dateReception;
	}

	public void setDateReception(Date dateReception) {
		this.dateReception = dateReception;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		statut = statut;
	}

	public Client getClientId() {
		return clientId;
	}

	public void setClientId(Client clientId) {
		this.clientId = clientId;
	}

	public Vendeur getVendeurId() {
		return vendeurId;
	}

	public void setVendeurId(Vendeur vendeurId) {
		this.vendeurId = vendeurId;
	}
	
}

package com.marketPlace.model;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;




@Entity
@Table(name="moyen_de_payement")
public class Moyen_de_Payement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private int id;
	
	@Column(name = "numeroCB")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	@Pattern(regexp = "^4[0-9]{12}(?:[0-9]{3})?$")
	private int numeroCB;
	
	
	@Column(name = "CVV")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	@Pattern(regexp = "^[0-9]{3,4}$")
	private int CVV;
	
	
    @OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="client_id")
	private Client obj_client;
    


	
	
	
	
	
	
	public Moyen_de_Payement() {
		super();
		// TODO Auto-generated constructor stub
	}








	public Moyen_de_Payement(int id,
			@NotNull(message = "les champ doit être rempli") @Size(min = 1, message = "le champ doit etre rempli") @Pattern(regexp = "^4[0-9]{12}(?:[0-9]{3})?$") int numeroCB,
			@NotNull(message = "les champ doit être rempli") @Size(min = 1, message = "le champ doit etre rempli") @Pattern(regexp = "^[0-9]{3,4}$") int CVV,
			Client obj_client) {
		super();
		this.id = id;
		this.numeroCB = numeroCB;
		this.CVV = CVV;
		this.obj_client = obj_client;
	}








	public int getId() {
		return id;
	}








	public void setId(int id) {
		this.id = id;
	}








	public int getNumeroCB() {
		return numeroCB;
	}








	public void setNumeroCB(int numeroCB) {
		this.numeroCB = numeroCB;
	}








	public int getCVV() {
		return CVV;
	}








	public void setCVV(String CVV) {
		CVV = CVV;
	}








	public Client getClient_id() {
		return obj_client;
	}








	public void setClient_id(Client obj_client) {
		this.obj_client = obj_client;
	}
	
	
	
	
	
	

}

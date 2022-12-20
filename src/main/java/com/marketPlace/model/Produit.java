package market_test;

import java.sql.Blob; 
import java.sql.Date;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import hibernate_project.Instructor;

@Entity
@Table(name="produit")
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "nom")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private String nom;
	
	@Column(name = "prix")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private int prix;
	
	@Column(name = "taille")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private String taille;
	
	@Column(name = "couleur")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private String couleur;
	
	@Column(name = "type")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private String type;
	
	
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="vendeur_id")
	private Vendeur vend;
	
	@Column(name = "note_moyenne")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private float note_moyenne;
	
	@Column(name = "image_1")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private Blob image_1;
	
	@Column(name = "image_2")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private Blob image_2;
	
	@Column(name = "image_3")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private Blob image_3;
	
	@Column(name = "image_4")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private Blob image_4;
	
	@Column(name = "date_de_creation")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private Date datedecreation;
	
	
	@Column(name = "datedemodification")
	@NotNull(message = "les champ doit être rempli")
	@Size(min = 1, message = "le champ doit etre rempli")
	private Date datedemodification;
	
	@OneToOne(mappedBy="prod",cascade=CascadeType.ALL)
	private Inventaire inventaire;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="panier",
	joinColumns= {@JoinColumn(name="produit_id")},
	inverseJoinColumns= { @JoinColumn(name = "client_id")})
	private List<Client> listclient;
	
	@OneToOne(mappedBy="produitId",cascade=CascadeType.ALL)
	private Historique historique;
	
	
	public Produit(int id, String nom, int prix, String taille, String couleur, String type, Vendeur vend,
			float note_moyenne, Blob image_1, Blob image_2, Blob image_3, Blob image_4, Date datedecreation,
			Date datedemodification) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.taille = taille;
		this.couleur = couleur;
		this.type = type;
		this.vend = vend;
		this.note_moyenne = note_moyenne;
		this.image_1 = image_1;
		this.image_2 = image_2;
		this.image_3 = image_3;
		this.image_4 = image_4;
		this.datedecreation = datedecreation;
		this.datedemodification = datedemodification;
	}



	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getPrix() {
		return prix;
	}



	public void setPrix(int prix) {
		this.prix = prix;
	}



	public String getTaille() {
		return taille;
	}



	public void setTaille(String taille) {
		this.taille = taille;
	}



	public String getCouleur() {
		return couleur;
	}



	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public Vendeur getVendeur_id() {
		return vend;
	}



	public void setVendeur_id(Vendeur vend) {
		this.vend = vend;
	}



	public float getNote_moyenne() {
		return note_moyenne;
	}



	public void setNote_moyenne(float note_moyenne) {
		this.note_moyenne = note_moyenne;
	}



	public Blob getImage_1() {
		return image_1;
	}



	public void setImage_1(Blob image_1) {
		this.image_1 = image_1;
	}



	public Blob getImage_2() {
		return image_2;
	}



	public void setImage_2(Blob image_2) {
		this.image_2 = image_2;
	}



	public Blob getImage_3() {
		return image_3;
	}



	public void setImage_3(Blob image_3) {
		this.image_3 = image_3;
	}



	public Blob getImage_4() {
		return image_4;
	}



	public void setImage_4(Blob image_4) {
		this.image_4 = image_4;
	}



	public Date getDatedecreation() {
		return datedecreation;
	}



	public void setDatedecreation(Date datedecreation) {
		this.datedecreation = datedecreation;
	}



	public Date getDatedemodification() {
		return datedemodification;
	}



	public void setDatedemodification(Date datedemodification) {
		this.datedemodification = datedemodification;
	}



	public Vendeur getVend() {
		return vend;
	}



	public void setVend(Vendeur vend) {
		this.vend = vend;
	}



	public Inventaire getInventaire() {
		return inventaire;
	}



	public void setInventaire(Inventaire inventaire) {
		this.inventaire = inventaire;
	}


   


	public List<Client> getListclient() {
		return listclient;
	}



	public void setListclient(List<Client> listclient) {
		this.listclient = listclient;
	}



	public Historique getHistorique() {
		return historique;
	}



	public void setHistorique(Historique historique) {
		this.historique = historique;
	}
	
	
	
	
	
	
	
	
	

}

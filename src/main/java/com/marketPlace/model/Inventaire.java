package market_test;

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
	
	
    @OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="vendeur_id")
	private Vendeur vend;

	
	
	
	

	public Inventaire() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Inventaire(int id, Produit prod,
			@NotNull(message = "les champ doit être rempli") @Size(min = 1, message = "le champ doit etre rempli") int quantité,
			Vendeur vend) {
		super();
		this.id = id;
		this.prod = prod;
		this.quantité = quantité;
		this.vend = vend;
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






	public Vendeur getVendeur_id() {
		return vend;
	}






	public void setVendeur_id(Vendeur vend) {
		this.vend = vend;
	}

	
	
	
	
	
	
	
	
	

}

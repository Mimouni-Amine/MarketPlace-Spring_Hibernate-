package com.marketPlace.service;


import com.marketPlace.model.Client;
import com.marketPlace.model.Produit;
import com.marketPlace.model.Utilisateur;
import com.marketPlace.model.Vendeur;

public interface Service1 {
	public int ajout_Utilisateur_and_Return_his_ID(Utilisateur utilisateur1) ;
	public void ajout_Client_a_User(Client client1,int idUser);
	public void ajout_Vendeur_a_User(Vendeur vendeur1, int idUser);
	public int check_UserName_and_Password(String userName, String password);
	public int get_User_ID(Utilisateur utilisateur1);
	public void ajout_Produit_a_Vendeur(Produit produit1, int idUser, String quantite);
}



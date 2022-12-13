package com.marketPlace.service;


import com.marketPlace.model.Client;
import com.marketPlace.model.Utilisateur;

public interface Utilisateur_Service {
	public void ajout_Utilisateur(Utilisateur utilisateur1);
	public void ajout_Client_a_User(Client client1,int idUser);
}



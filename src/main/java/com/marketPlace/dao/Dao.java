package com.marketPlace.dao;


import com.marketPlace.model.Client;
import com.marketPlace.model.Utilisateur;

public interface Dao {
	public void  ajout_Utilisateur(Utilisateur utilisateur1);
	public void ajout_Client_a_User(Client client1, int idUser);
	public int get_Current_User_ID(Utilisateur utilisateur1);
}

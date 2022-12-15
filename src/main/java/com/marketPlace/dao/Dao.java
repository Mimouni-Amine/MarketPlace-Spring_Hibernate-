package com.marketPlace.dao;


import com.marketPlace.model.Client;
import com.marketPlace.model.Utilisateur;

public interface Dao {
	public int ajout_Utilisateur_and_Return_his_ID(Utilisateur utilisateur1);
	public void ajout_Client_a_User(Client client1, int idUser);
	public int check_UserName_and_Password(String userName, String password);
}

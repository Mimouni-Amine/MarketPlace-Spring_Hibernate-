package com.marketPlace.service;

import org.hibernate.Session;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marketPlace.dao.Dao;

import com.marketPlace.model.Client;
import com.marketPlace.model.Produit;
import com.marketPlace.model.Utilisateur;
import com.marketPlace.model.Vendeur;




@Service  //component qui va interragir avec la base de donnée
public class Service_Implementations implements Service1 {

	
	@Autowired
	private Dao utilisateur_dao1;
	
	@Transactional
	public int ajout_Utilisateur_and_Return_his_ID(Utilisateur utilisateur1) {
		
		
		return utilisateur_dao1.ajout_Utilisateur_and_Return_his_ID(utilisateur1);
	}
	
	@Transactional
	@Override
	public void ajout_Client_a_User(Client client1, int idUser) {
		
		utilisateur_dao1.ajout_Client_a_User(client1, idUser);
	}
	
	@Transactional
	@Override
	public void ajout_Vendeur_a_User(Vendeur vendeur1, int idUser) {
		
		utilisateur_dao1.ajout_Vendeur_a_User(vendeur1, idUser);
	}

	@Transactional
	@Override
	public int check_UserName_and_Password(String userName, String password){
		return utilisateur_dao1.check_UserName_and_Password(userName, password);
	}

	@Transactional
	@Override
	public int get_User_ID(Utilisateur utilisateur1) {
		return utilisateur_dao1.get_User_ID(utilisateur1);
	}
	
	@Transactional
	@Override
	public void ajout_Produit_a_Vendeur(Produit produit1, int idUser, String quantite) {
		utilisateur_dao1.ajout_Produit_a_Vendeur( produit1, idUser, quantite);
		
	}


}

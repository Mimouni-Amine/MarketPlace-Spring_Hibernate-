package com.marketPlace.service;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marketPlace.dao.Utilisateur_dao;
import com.marketPlace.model.Client;
import com.marketPlace.model.Utilisateur;




@Service  //component qui va interragir avec la base de donnée
public class Utilisateur_Service_Implementations implements Utilisateur_Service {

	
	@Autowired
	private Utilisateur_dao utilisateur_dao1;
	
	@Transactional
	public void ajout_Utilisateur(Utilisateur utilisateur1){
		
		utilisateur_dao1.ajout_Utilisateur(utilisateur1);
	}
	@Transactional
	@Override
	public void ajout_Client_a_User(Client client1, int idUser) {
		// TODO Auto-generated method stub
		
	}



}

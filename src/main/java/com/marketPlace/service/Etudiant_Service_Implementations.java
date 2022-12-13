package com.marketPlace.service;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marketPlace.dao.Etudiant_dao;
import com.marketPlace.dao.Etudiant_dao_implementations;
import com.marketPlace.model.Etudiant;
import com.marketPlace.model.Etudiant2;




@Service  //component qui va interragir avec la base de donnée
public class Etudiant_Service_Implementations implements Etudiant_Service {

	//test2
	@Autowired
	private Etudiant_dao etudiant_dao;
	
	@Transactional
	public void ajoutEtu(Etudiant etudiant1) {
		etudiant_dao.ajoutEtu(etudiant1);		
	}

	@Transactional
	@Override
	public void ajoutEtu2(Etudiant2 etudiant2) {
		etudiant_dao.ajoutEtu2(etudiant2);	
	}

}

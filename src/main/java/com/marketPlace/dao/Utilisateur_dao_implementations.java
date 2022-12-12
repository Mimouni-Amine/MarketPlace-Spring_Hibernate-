package com.marketPlace.dao;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.marketPlace.model.Etudiant;
import com.marketPlace.model.Etudiant2;
import com.marketPlace.model.Utilisateur;




@Repository  //component qui va interragir avec la base de donnée
public class Utilisateur_dao_implementations implements Utilisateur_dao {

	
	@Autowired
	private SessionFactory sessionFactory;
	

	public void ajout_Utilisateur(Utilisateur utilisateur1) {
		Session session= sessionFactory.getCurrentSession();

			session.saveOrUpdate(utilisateur1);
	}
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	

}

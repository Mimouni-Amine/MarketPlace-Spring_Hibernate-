package com.marketPlace.dao;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.marketPlace.model.Etudiant;
import com.marketPlace.model.Etudiant2;




@Repository  //component qui va interragir avec la base de donnée
public class Etudiant_dao_implementations implements Etudiant_dao {

	
	@Autowired
	private SessionFactory sessionFactory;
	

	public void ajoutEtu(Etudiant etudiant1) {
		Session session= sessionFactory.getCurrentSession();

			session.saveOrUpdate(etudiant1);
	}
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	
	public void ajoutEtu2(Etudiant2 etudiant2) {
		Session session= sessionFactory.getCurrentSession();

		session.saveOrUpdate(etudiant2);
		
	}
	

}

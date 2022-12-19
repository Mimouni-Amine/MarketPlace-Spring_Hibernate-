package com.marketPlace.dao;

import org.hibernate.Session;





import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.marketPlace.model.Client;
import com.marketPlace.model.Utilisateur;
import com.marketPlace.model.Vendeur;





@Repository  //component qui va interragir avec la base de donnée
public class Dao_implementations implements Dao {

	
	@Autowired
	private SessionFactory sessionFactory;
	

	public int ajout_Utilisateur_and_Return_his_ID(Utilisateur utilisateur1) {
		Session session= sessionFactory.getCurrentSession();
		Integer id=-1;
		Utilisateur utilisateur2= new Utilisateur();
		try {
		Query<Utilisateur> query = session.createQuery("FROM Utilisateur WHERE user_name= '" + utilisateur1.getUser_name()+ "'", Utilisateur.class); 
		utilisateur2=(Utilisateur)query.getSingleResult();
		System.out.println("Duplicate");
		} catch(Exception e) {
			System.out.println("No Duplicate");
			session.save(utilisateur1);
			return -2;
		}
		return id;
	}


	
	public int get_User_ID(Utilisateur utilisateur1) {
	Session session= sessionFactory.getCurrentSession();
	Query<Utilisateur> query = session.createQuery("FROM Utilisateur WHERE user_name= '" + utilisateur1.getUser_name()+ "' ", Utilisateur.class); 
	utilisateur1=(Utilisateur)query.getSingleResult();
	return utilisateur1.getId();
	}
	

	public void ajout_Client_a_User(Client client1, int idUser) {
		
		Session session= sessionFactory.getCurrentSession();
	
		Utilisateur utilisateur1 = session.get(Utilisateur.class, idUser);
		System.out.println(utilisateur1);
		utilisateur1.setObj_client(client1);
		session.saveOrUpdate(client1);
		session.saveOrUpdate(utilisateur1);
	}
	
	public void ajout_Vendeur_a_User(Vendeur vendeur1, int idUser) {
		Session session= sessionFactory.getCurrentSession();
		Utilisateur utilisateur1 = session.get(Utilisateur.class, idUser);
		System.out.println(utilisateur1);
		utilisateur1.setObj_vendeur(vendeur1);
		session.saveOrUpdate(vendeur1);
		session.saveOrUpdate(utilisateur1);
	}
	
	public int check_UserName_and_Password(String userName, String password) {
		Session session= sessionFactory.getCurrentSession();
		Utilisateur utilisateur1= new Utilisateur();
		try {
		Query<Utilisateur> query = session.createQuery("FROM Utilisateur WHERE user_name= '" + userName+ "' and mot_de_passe='"+ password+ "'", Utilisateur.class); 
		utilisateur1=(Utilisateur)query.getSingleResult();
		} catch(Exception e) {
			return -1;
		}
		return utilisateur1.getId();
	}
	
	
	

	
	


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	

}

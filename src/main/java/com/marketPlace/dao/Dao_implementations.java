package com.marketPlace.dao;

import org.hibernate.Session;





import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.marketPlace.model.Client;
import com.marketPlace.model.Utilisateur;





@Repository  //component qui va interragir avec la base de donnée
public class Dao_implementations implements Dao {

	
	@Autowired
	private SessionFactory sessionFactory;
	

	public int ajout_Utilisateur_and_Return_his_ID(Utilisateur utilisateur1) {
		Session session= sessionFactory.getCurrentSession();
		Integer id = (Integer)session.save(utilisateur1);
		return id;
	}



	public void ajout_Client_a_User(Client client1, int idUser) {
		
		Session session= sessionFactory.getCurrentSession();
	
		Utilisateur utilisateur1 = session.get(Utilisateur.class, idUser);
		System.out.println(utilisateur1);
		utilisateur1.setObj_client(client1);
		session.saveOrUpdate(client1);
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

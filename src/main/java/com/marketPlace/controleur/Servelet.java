package com.marketPlace.controleur;



import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marketPlace.model.Client;
import com.marketPlace.model.Utilisateur;
import com.marketPlace.model.Vendeur;
import com.marketPlace.service.Service1;


//need to have unique username
//Validation
@Controller
public class Servelet {
	
	private int utilisateurActuel_ID;
	
	@Autowired
	private Service1 service1;
	
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);// si on met des espace, on considere que ces espaces sont des string null
		
	}
	
	
	
	
	
	//When Connected User Add to get his ID Associate it with utilisateurActuel_ID and Use the dao Method

	@RequestMapping("/")
	public String pagePrincipale() {
		
		return "Page_Principale";
	//	return "Utilisateur_Connexion";
	}
	
	@RequestMapping("/versPage_ConnexionUtilisateur")
	public String versPageConnexionUtilisateur() {
		return "Utilisateur_Connexion";
	}
	
	
	@RequestMapping("/versPage_Inscrire_Utilisateur")
	public String InitialiserListe( Model model) {
		
		Utilisateur utilisateur1 = new Utilisateur();
		Client client1= new Client();
		model.addAttribute("utilisateur1",utilisateur1);
		model.addAttribute("client1",client1);
		return "Utilisateur_formulaire";
		
	}
	
	
	
	@RequestMapping("/client_add")
	public String client_add(Model model) {
		Client client1= new Client();
		
		model.addAttribute("client1",client1);
		return "Client_formulaire";
	}
	
	@RequestMapping("/vendeur_add")
	public String vendeur_add(Model model) {
		Vendeur vendeur1= new Vendeur();
		
		model.addAttribute("vendeur1",vendeur1);
		return "Vendeur_formulaire";
	}
	

	@RequestMapping("/utilisateur_Connexion")
	public String utilisateur_Connexion(HttpServletRequest request,Utilisateur utilisateur1){
		
		String user_name= request.getParameter("user_name");
		String password= request.getParameter("password");
		
		System.out.println(user_name);
		System.out.println(password);
		this.utilisateurActuel_ID=service1.check_UserName_and_Password(user_name, password);
		if(this.utilisateurActuel_ID==-1) {
			return "Utilisateur_Connexion";
		}else {
			//return "/client_add";
			return "Page_Client_OU_Vendeur";
		}
	}

	@RequestMapping("/Utilisateur_add")
	public String utilisateur_add(@Valid @ModelAttribute("utilisateur1") Utilisateur utilisateur1, BindingResult bindingResult) {
		//etudiant1.setId(5);
		 System.out.println("entered");
		
		if(service1.ajout_Utilisateur_and_Return_his_ID(utilisateur1)==-1) {
			System.out.println("Returne -1");
			return "Utilisateur_formulaire";
		}else {
			//return "/client_add";
			
			
			System.out.println("Returned the ID");
			this.utilisateurActuel_ID=service1.get_User_ID(utilisateur1);
			System.out.println(this.utilisateurActuel_ID);
			return "Page_Client_OU_Vendeur";
		}
		/*
		if (bindingResult.hasErrors()) {
			//return "Utilisateur_formulaire";
			return "Utilisateur_formulaire";
		}else {
			

		}  */

	}
	
	@RequestMapping("/Client_Add_toUser_ID")
	public String client_Add_toUser_ID(@Valid @ModelAttribute("client1") Client client1, BindingResult bindingResult) {
		//etudiant1.setId(5);
		
		service1.ajout_Client_a_User(client1, this.utilisateurActuel_ID);
		
		if (bindingResult.hasErrors()) {
			return "Utilisateur_Resultat";
		}else {
			
			
			return "Utilisateur_Resultat";
		}

	}
	
	@RequestMapping("/Vendeur_Add_toUser_ID")
	public String vendeur_Add_toUser_ID(@Valid @ModelAttribute("vendeur1") Vendeur vendeur1, BindingResult bindingResult) {
		//etudiant1.setId(5);
		
		service1.ajout_Vendeur_a_User(vendeur1, this.utilisateurActuel_ID);
		
		if (bindingResult.hasErrors()) {
			return "Utilisateur_Resultat";
		}else {
			
			
			return "Utilisateur_Resultat";
		}

	}
	

}

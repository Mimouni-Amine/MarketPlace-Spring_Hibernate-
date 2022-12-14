package com.marketPlace.controleur;



import javax.validation.Valid;


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

import com.marketPlace.service.Service1;



@Controller
public class Servelet {
	
	private int utilisateurActuel_ID;
	@Autowired
	private Service1 utilisateur_Service1;
	
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);// si on met des espace, on considere que ces espaces sont des string null
		
	}
	
	
	
	
	
	//When Connected User Add to get his ID Associate it with utilisateurActuel_ID and Use the dao Method
	@RequestMapping("/")
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

	@RequestMapping("/Utilisateur_add")
	public String utilisateur_add(@Valid @ModelAttribute("utilisateur1") Utilisateur utilisateur1, BindingResult bindingResult) {
		//etudiant1.setId(5);

		if (bindingResult.hasErrors()) {
			return "Utilisateur_formulaire";
		}else {
			
			utilisateur_Service1.ajout_Utilisateur(utilisateur1);
			this.utilisateurActuel_ID=utilisateur_Service1.get_Current_User_ID(utilisateur1);
			return "Utilisateur_formulaire";
		}

	}
	
	@RequestMapping("/Client_Add_toUser_ID")
	public String client_Add_toUser_ID(@Valid @ModelAttribute("client1") Client client1, BindingResult bindingResult) {
		//etudiant1.setId(5);
		
		utilisateur_Service1.ajout_Client_a_User(client1, this.utilisateurActuel_ID);
		
		if (bindingResult.hasErrors()) {
			return "Utilisateur_Resultat";
		}else {
			
			
			return "Utilisateur_Resultat";
		}

	}
	

}

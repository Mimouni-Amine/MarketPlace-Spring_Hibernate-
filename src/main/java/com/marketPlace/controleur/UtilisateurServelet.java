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

import com.marketPlace.dao.Etudiant_dao;
import com.marketPlace.model.Etudiant;
import com.marketPlace.model.Utilisateur;
import com.marketPlace.service.Etudiant_Service;
import com.marketPlace.service.Utilisateur_Service;



@Controller
public class UtilisateurServelet {
	
	@Autowired
	private Utilisateur_Service utilisateur_Service1;
	
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);// si on met des espace, on considere que ces espaces sont des string null
		
	}
	
	
	@RequestMapping("/")
	public String InitialiserListe( Model model) {
		
		Utilisateur utilisateur1 = new Utilisateur();
	
		model.addAttribute("utilisateur1",utilisateur1);
		return "Utilisateur_formulaire";
	}
	


	@RequestMapping("/Utilisateur_add")
	public String afficherHelloPage3(@Valid @ModelAttribute("utilisateur1") Utilisateur utilisateur1, BindingResult bindingResult) {
		//etudiant1.setId(5);
		
		
		
		
		if (bindingResult.hasErrors()) {
			
			return "Utilisateur_Resultat";
		}else {
			utilisateur_Service1.ajout_Utilisateur(null);
			return "Utilisateur_Resultat";
		}
		
		
//en Plus 
		
		
	}

}

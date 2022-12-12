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
import com.marketPlace.service.Etudiant_Service;



@Controller
public class EtudiantServelet {
	
	@Autowired
	private Etudiant_Service etudiant_Service;
	
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);// si on met des espace, on considere que ces espaces sont des string null
		
	}
	
	
	@RequestMapping("/")
	public String InitialiserListe( Model model) {
		
		Etudiant etudiant1= new Etudiant();
	
		model.addAttribute("etudiant1",etudiant1);
		return "Etudiant_formulaire";
	}
	


	@RequestMapping("/Etudiant_add")
	public String afficherHelloPage3(@Valid @ModelAttribute("etudiant1") Etudiant etudiant1, BindingResult bindingResult) {
		//etudiant1.setId(5);
		
		
		
		System.out.println("Nom:" +etudiant1.getNom());
		System.out.println("Prenom:" +etudiant1.getPrenom());
		
		if (bindingResult.hasErrors()) {
			
			return "Etudiant_formulaire";
		}else {
			etudiant_Service.ajoutEtu(etudiant1);
			return "Eudiant_Resultat";
		}
		
		
//en Plus 
		
		
	}

}

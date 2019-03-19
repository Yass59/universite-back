package fr.roudane.pizzeria.pizza.controller;

import org.springframework.ui.Model;

import fr.roudane.pizzeria.pizza.domain.PizzeriaBean;


public interface IPizzeriaController {

	public String getPizza(Model model);
	
	public String InfoPizza (Model model, Integer id);
	
	public String supprimerPizza (Model model, Integer id);
	
	public String ajouterPizza (Model model);
	
	public String ajouterpIZZAValidation(Model model,PizzeriaBean p);
	
	public String modifierpizza (Model model, Integer id);
	
	
	public String modificationValider (Model model, PizzeriaBean p);
	
	
}

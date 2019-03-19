package fr.roudane.pizzeria.pizza.service;

import java.util.List;

import fr.roudane.pizzeria.pizza.domain.PizzeriaBean;



public interface IpizzaService {

	
	
	public List<PizzeriaBean>findAll();
	
	public PizzeriaBean findOnePizza(Integer id);
	
	
	public void supprimer(Integer id);
	
	
	
	public void AjouterPizza(PizzeriaBean piz);
	
	
	public void modifierpizza(PizzeriaBean piz);
	
	
	
}

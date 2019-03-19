package fr.roudane.pizzeria.pizza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.roudane.pizzeria.pizza.domain.PizzeriaBean;
import fr.roudane.pizzeria.pizza.repository.IpizzaRepository;
import fr.roudane.pizzeria.pizza.service.IpizzaService;


@Service
public class PizzeriaService implements IpizzaService{

	@Autowired IpizzaRepository pizzarepository;

	@Override
	public List<PizzeriaBean> findAll() {
	List<PizzeriaBean>liste = pizzarepository.findAll();
		return liste ;
	}

	@Override
	public PizzeriaBean findOnePizza(Integer id) {
		
		PizzeriaBean p = pizzarepository.getOne(id);
		return p;
		
		
	}

	@Override
	public void supprimer(Integer id) {
		pizzarepository.deleteById(id);
	}

	@Override
	public void AjouterPizza(PizzeriaBean piz) {

		pizzarepository.save(piz);
	}

	@Override
	public void modifierpizza(PizzeriaBean piz) {
		pizzarepository.save(piz);
		
	}

	
	
	
	
	
	
	
	
	
	
	
}

package fr.roudane.pizzeria.pizza.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.roudane.pizzeria.pizza.controller.IPizzeriaController;
import fr.roudane.pizzeria.pizza.domain.PizzeriaBean;
import fr.roudane.pizzeria.pizza.service.impl.PizzeriaService;
@Controller
public class PizzeriaController implements IPizzeriaController {

	Logger log = LoggerFactory.getLogger(PizzeriaController.class);
	
	@Autowired PizzeriaService pizzaservice;
	
	
	@Override
	@RequestMapping("/pizza")
	public String getPizza(Model model) {
		
		List<PizzeriaBean> liste = pizzaservice.findAll();
		model.addAttribute("pizza", liste);
		
		return "pizza";
	}

	@Override
	@RequestMapping("/pizzaInfo")
	public String InfoPizza(Model model, @RequestParam("id") Integer id) {
		PizzeriaBean pizz = pizzaservice.findOnePizza(id);
		log.info("pizza: " + pizz.getLibelle());
		log.debug("description : {},", pizz.getDescription());
		log.warn("l'url de la pizza : {}", pizz.getPhoto());
		model.addAttribute("pizza", pizz);
		
		return "pizzainfo";
	}

	@Override
	@RequestMapping ("/supprimer")
	public String supprimerPizza(Model model, Integer id) {
		
		pizzaservice.supprimer(id);
		
		
		return "redirect:/pizza";
	}

	@Override
	@GetMapping("/ajouter")
	public String ajouterPizza(Model model) {

		PizzeriaBean p = new PizzeriaBean();
		
		model.addAttribute("p", p);
		
		return "ajouterpizza";
	}

	@Override
	@PostMapping("ajouter-pizza")
	public String ajouterpIZZAValidation(Model model, @ModelAttribute PizzeriaBean p) {
		
		pizzaservice.AjouterPizza(p);
		
		return "redirect:/pizza";
	}

	@Override
	@GetMapping("modifier")
	public String modifierpizza(Model model,@RequestParam Integer id) {
		
		PizzeriaBean p = pizzaservice.findOnePizza(id);
		model.addAttribute("p", p);
		
		return "modifier";
	}

	@Override
	@PostMapping ("modifier-pizza")
	public String modificationValider(Model model, @ModelAttribute PizzeriaBean p) {

		
		pizzaservice.modifierpizza(p);
		
		
		return "redirect:/pizza";
	}

	
	
	
	
	
	
}

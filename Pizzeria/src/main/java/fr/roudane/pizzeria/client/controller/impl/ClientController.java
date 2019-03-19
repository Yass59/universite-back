package fr.roudane.pizzeria.client.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.roudane.pizzeria.client.controller.IClientController;
import fr.roudane.pizzeria.client.domain.ClientBean;
import fr.roudane.pizzeria.client.service.impl.ClientService;
@Controller
public class ClientController implements IClientController {

	@Autowired ClientService clientservice;
	
	
	
	@Override
	@GetMapping("/client")
	public String getCLIENT(Model model) {
		
		List<ClientBean>Client = clientservice.findAll();
		model.addAttribute("client", Client);
		
		
		return "clienthtml";
	}



	@Override
	@GetMapping ("/clientinfos")
	public String avoir1client(Model model, Integer id) {

		ClientBean cli = clientservice.findOne(id);
		model.addAttribute("client", cli);
		
		
		return "clientinfos";
	}



	@Override
	@GetMapping("/ajoutclient")
	public String ajouter1client(Model model) {

		ClientBean c = new ClientBean();
		model.addAttribute("client", c);
		
		return "ajoutclient";
	}



	@Override
	@PostMapping("ajout-client")
	public String validationclient(Model model, @ModelAttribute ClientBean c) {
		
		clientservice.ajouterClient(c);
		
		
		
		return "redirect:/client";
	}



	@Override
	@GetMapping("/modification")
	public String modifierClient(Model model, Integer id) {
		
		ClientBean c = clientservice.findOne(id);
		model.addAttribute("c", c);
		
		return "modifierclient";
	}



	@Override
	@PostMapping("modif")
	public String validationdemodiff(Model model, ClientBean c) {
	
		clientservice.ajouterClient(c);		
		
		
		return "redirect:/client";
	}



	@Override
	@GetMapping("/supprimer")
	public String supprimerClient(Model model, Integer id) {
		
		
		
		clientservice.supclient(id);
		
		
		return "redirect:/client";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

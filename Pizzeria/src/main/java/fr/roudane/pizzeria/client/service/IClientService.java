package fr.roudane.pizzeria.client.service;

import java.util.List;

import fr.roudane.pizzeria.client.domain.ClientBean;


public interface IClientService {

	
	
	
	public List<ClientBean>findAll();
	
	
	public ClientBean findOne(Integer id);
	
	
	public void ajouterClient (ClientBean client);
	
	
	public void modifierClient(ClientBean client);
	
	
	
	public void supclient(Integer id);
	
}

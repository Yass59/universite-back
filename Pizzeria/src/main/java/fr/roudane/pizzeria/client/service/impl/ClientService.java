package fr.roudane.pizzeria.client.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.roudane.pizzeria.client.domain.ClientBean;
import fr.roudane.pizzeria.client.repository.IClientRepository;
import fr.roudane.pizzeria.client.service.IClientService;
@Service
public class ClientService  implements IClientService{

	
	@Autowired IClientRepository clientrepository;
	
	@Override
	public List<ClientBean> findAll() {

		List<ClientBean>listeclient = clientrepository.findAll();
		
		
		
		
		return listeclient;
	}

	@Override
	public ClientBean findOne(Integer id) {
		
		
		ClientBean c = clientrepository.getOne(id);
		
		
		return c;
	}

	@Override
	public void ajouterClient(ClientBean client) {
	
		
		clientrepository.save(client);
		
		
	}

	@Override
	public void modifierClient(ClientBean client) {
		
		
		
		clientrepository.save(client);
		
		
	}

	@Override
	public void supclient(Integer id) {
	clientrepository.deleteById(id);
		
	}

}

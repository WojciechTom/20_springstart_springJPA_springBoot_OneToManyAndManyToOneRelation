package pl.javastart.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.javastart.model.Client;
import pl.javastart.model.Order;

@Repository
@Transactional
public class DaoClient {

	@PersistenceContext
	private EntityManager manago; 


//CONSTRUCTORS------------------------------------------------------------
	public DaoClient() {}
	
	public DaoClient(EntityManager manago) {
		this.manago = manago;
	}

//METHODS------------------------------------------------------------------
	public void save(Client client) {
		for(Order item : client.getOrders()) {
			manago.persist(item);
		}
		manago.persist(client);
	}
	
	
	
	public Client get(Long id) {
		Client client = manago.find(Client.class, id);
		client.getOrders().size();
		return client;
	}
	
	
	
	public void update (Client client) {
		for(Order item : client.getOrders()) {
			if(item.getId() == null ){
			manago.persist(item);
			} else { 
				manago.merge(item);
			} 
			
		}
		manago.merge(client);
	}
	
	
	
	public void remove (Client client) {
		Client clientToRemove = manago.merge(client);
		
		for(Order item : clientToRemove.getOrders()) {
			System.out.println(item.toString());
			manago.remove(item);
		}
		manago.remove(clientToRemove);
	}
	
}

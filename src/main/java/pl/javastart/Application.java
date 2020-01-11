package pl.javastart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.javastart.dao.DaoClient;
import pl.javastart.model.Client;
import pl.javastart.model.Order;


@SpringBootApplication
public class Application {

	public static void main(String[] args) throws InterruptedException {
			
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		DaoClient daoClient = ctx.getBean(DaoClient.class); 
		
		
		
// ADD NEW CUSTOMER AND NEW ORDERS AND SAVE ALL IN HD 
		
		/*
		Client client1 = new Client("Wojciech", "Tomczyk", "Plana 2");
		Order order1 = new Order("rzutnik", "rzutnik do ogladania filmow", client1);
		Order order2 = new Order("telewizor LCD", "telewizon marki RUBIN", client1);
		Client client2 = new Client("Tomasz", "Wilk", "Graniczna 12");
		Order order3 = new Order("smartphone", "smartphone galaxy note 4", client2);
		Order order4 = new Order("płyta Cd", "płyta RHCP Californication", client2);
		
		ArrayList<Order> lista1 = new ArrayList<>();
		lista1.add(order1);
		lista1.add(order2);
		client1.setOrders(lista1);
		
		ArrayList<Order> lista2 = new ArrayList<>();
		lista2.add(order3);
		lista2.add(order4);
		client2.setOrders(lista2);
		
		daoClient.save(client1);
		daoClient.save(client2);
		Thread.sleep(19000);
		ctx.close();
		*/
		
		
		
//ADD ONE ORDER TO ONE OF A CLIENT (ADD TO ORDER LIST)  
		
		/*
		Client clientToChangeOrder = daoClient.get(2L);
		Order order5 = new Order("lina dynamiczna", "lina dynamiczna renomowanej firmy beal", clientToChangeOrder );
		
		List<Order> newLista =clientToChangeOrder.getOrders();      //new ArrayList<Order>();
		newLista.add(order5);
		clientToChangeOrder.setOrders(newLista);
		daoClient.update(clientToChangeOrder);
		*/
		
//EDIT A CLIENT
		/*
		Client clientToChange = daoClient.get(1L);
		clientToChange.setFirstName("Franek");
		daoClient.update(clientToChange);
		*/
	
		
//REMOVE A CLIENT
		
		/*
		Client clientToRemove = daoClient.get(1L);
		daoClient.remove(clientToRemove);
		*/
		
	}

}

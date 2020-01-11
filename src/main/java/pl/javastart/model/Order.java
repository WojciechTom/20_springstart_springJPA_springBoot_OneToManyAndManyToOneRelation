package pl.javastart.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private Long id;
	@Column(name="product_name")
	private String product;
	@Column(name="order_details")
	private String orderDetails;
	@ManyToOne
	@JoinColumn(name="clinet_id")
	private Client client;
	
	
	
	public Order () {}
	
	public Order(String product, String orderDetails, Client client) {
		this.product = product;
		this.orderDetails = orderDetails;
		this.client = client;
	}
		

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}

	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", product=" + product + 
				", orderDetails=" + orderDetails + ", clientFirstName=" + client.getFirstName() + "]";
	}
	
	
}

package jpafirst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpafirst.entity.Order;
import jpafirst.entity.Product;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-first-project");
//		EntityManager em = emf.createEntityManager();
				
//		Product product = new Product();
//		product.setName("Product 1");
//		
//		
//		em.getTransaction().begin();
//		em.persist(product);
//		em.getTransaction().commit();
		
		
//		Order order = new Order();
//		order.getOrderItems().add(new OrderItem(productId, amount));
		
		
		
//		em.close();
		emf.close();

	}

}

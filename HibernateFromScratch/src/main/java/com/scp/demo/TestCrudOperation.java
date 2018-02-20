package com.scp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestCrudOperation {

	public static void main(String[] args) {
		Product p1 = new Product(80, "Product80", 3200, "New Product5");
		
		/*Product p1 = new Product(80, "Product80", 3200, "New Product5");
		Product p2 = new Product(81, "Product81", 2500, "New Product6");
		Product p3 = new Product(82, "Product82", 6300, "New Product7");
*/
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		
		//Product p1 = new Product(80, "Product80", 3200, "New Product5");//transient
		
		//Session session = sessionFactory.getCurrentSession();
		Session session1 = sessionFactory.openSession();
		session1.save(p1);
		
		
	/*	Product p77 = session1.get(Product.class, 77); //Persistent
		session1.close();
		
		
		Product p1 = new Product(80, "Product80", 3200, "New Product5");//transient
		
		
		//p77.setProductName("XXXXXX");//detached
		
		*//**
		 * DB -- product77
		 * Session2 Context --p77 XXXXXXX  p777 YYYYYY
		 *//*
		
		
		Session session2 = sessionFactory.openSession();
		Transaction tr = session2.beginTransaction();
		Product p777 = session2.get(Product.class, 77); // Product77 // Persistnt
		p777.setProductName("YYYYY"); // Modify persistent state wala ob
		session2.evict(p777);
		
		//session2.update(p77); //Memory wala object detached state jiska value XXXXX usko
		// Session2 context mein lana hai and this will be a persistent state now
		// org.hibernate.NonUniqueObjectException: A different object with the same identifier value was already associated with the session
		
		
		session2.update(p77);
		session2.flush();
		tr.commit();
		
		*/
		/*
		 * Update and merge
		 */
		
		
		
		
		
	/*	
	 	Get VS Load
	 * System.out.println("Fetch object with Get");
		Product p1 = session.get(Product.class,100);
		
		System.out.println("Fetch object with load");
		Product p2 = session.load(Product.class,100);
		
		System.out.println("Print result of get");
		System.out.println(p1);
		
		System.out.println("Print result of load");
		System.out.println(p2);
	*/	
		/*Transaction tr = session.beginTransaction();
		session.save(p1); //Persistent
		session.save(p2);
		session.save(p3);
		session.flush();
		tr.commit();*/
	}

}

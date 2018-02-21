package com.hibernate.demo.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*Employee e= new Employee();
    	e.setEid(3);
    	e.setEname("jagdish");
    	e.setEsal(120000);
    	*/
    	
    	
    	Product e1 = new Product();
    	Product e2 = new Product();//transient
    	e1.setProductId(1);
    	e1.setProductName("Apple");
    	e2.setProductId(2);
    	e2.setProductName("Mango");
    	
    	Configuration con= new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf= con.buildSessionFactory();
    	Session session1= sf.openSession();
    	Transaction t1= session1.beginTransaction();
    	//session1.save(e1);
    	//session1.save(e2);
    	Product p= session1.get(Product.class, 1);
    	p.setProductName("jagdale");
    	//session1.update(e1);
    	
    	session1.merge(e1);
    	t1.commit();
    	session1.close();
    	
    	//Session session2= sf.openSession();

    	
    	//p.setProductName("xyzjgj");
    	//session2.update(e1);
    	//session2.close();
    }
}

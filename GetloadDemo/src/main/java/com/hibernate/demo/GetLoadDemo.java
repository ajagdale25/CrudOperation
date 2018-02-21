package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetLoadDemo 
{
    public static void main( String[] args )
    {
    	
    	Employee employee1 = new Employee();
    	employee1.setEmpId(1000);
    	employee1.setEmpName("Jagdish");
    	
    	/*Employee employee2 = new Employee();
    	employee2.setEmpId(2);
    	employee2.setEmpName("Amol");*/
    	
    	Configuration configuration = new Configuration();
    	configuration.configure();
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	session.save(employee1);
    	//session.save(employee2);
    	
    	System.out.println("Employee 3 using get : ");
    	Employee employee3 = session.get(Employee.class, 1);
    	
    	employee3.setEmpName("abc");
    	System.out.println("Employee 1 : "+employee1);
    	//System.out.println("Employee 3 : "+employee3);
    	transaction.commit();
    	System.out.println("Employee 3 using load : ");
    	Employee employee4 = session.load(Employee.class, 2);
    	System.out.println("Employee 3 using load : "+employee4);
    	
    	
    	
    	
    	
    }
}

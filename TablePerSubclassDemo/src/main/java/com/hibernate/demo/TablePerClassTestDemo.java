package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/*
 * 
 * In Hibernate Table Per Subclass key element will be used.
In Table Per Subclass first base class object will be stored, then derived class object will be stored.
Hibernate releases the primary key before derived class object will be stored.

*/


public class TablePerClassTestDemo {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Payment payment = new Payment();
		payment.setPaymentId(5);
		payment.setAmmount(30007);

		CreditCard creditcard = new CreditCard();
		creditcard.setCardNumber(45);
		creditcard.setCardType("master");

		DebitCart debitcard = new DebitCart();
		debitcard.setPinNumber(643234);
		debitcard.setCardName("SBI");

		Transaction transaction = session.beginTransaction();

		session.save(payment);
		session.save(creditcard);
		session.save(debitcard);
		transaction.commit();
		session.close();
		System.out.println("Payment datails all are inserted using Table Per Subclass");
	}

}

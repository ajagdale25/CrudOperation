package com.hibernate.demo.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {

	public static void main(String[] args) {
		Parent p1= new Parent(1, 1201);
		//Child c1= new Child(2, 111,112,113);
		
		
		Configuration configuration= new Configuration();
		SessionFactory sf= configuration.configure().buildSessionFactory();
		Session session= sf.openSession();
		Transaction tx= session.beginTransaction();
		session.save(p1);
		//session.save(c1);

		tx.commit();
		
	}

}
@Entity
@Table(name="Parent_1")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
class Parent
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int p1;
	
	public Parent(int id, int p1) {
		super();
		this.id = id;
		this.p1 = p1;
	}
	
	public Parent() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getP1() {
		return p1;
	}
	public void setP1(int p1) {
		this.p1 = p1;
	}
	
}
@Entity
class Child extends Parent
{
	private int c1;
	private int c2;
	public Child(int id, int p1, int c1, int c2) {
		super(id, p1);
		this.c1 = c1;
		this.c2 = c2;
	}
	public Child() {
		super();
	}
	public int getC1() {
		return c1;
	}
	public void setC1(int c1) {
		this.c1 = c1;
	}
	public int getC2() {
		return c2;
	}
	public void setC2(int c2) {
		this.c2 = c2;
	}
	
}
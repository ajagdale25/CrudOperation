package com.scp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scp.hibernate.entity.Student;
import com.scp.hibernate.entity.Subjects;
import com.scp.hibernate.util.HibernateUtil;

public class ManyToManyTest {
	public static void main(String[] args) {
		Student student = new Student("Amol", "Jagdale");
		Student student2 = new Student("Ashutosh", "Xyz");

		Subjects subject1 = new Subjects("JAVA");
		Subjects subject2 = new Subjects(".Net");
		Subjects subject3 = new Subjects("Python");

		student.getSubjects().add(subject1);
		student.getSubjects().add(subject2);

		student2.getSubjects().add(subject2);
		student2.getSubjects().add(subject3);

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.persist(student);
		session.persist(student2);

		transaction.commit();
		session.close();

	}
}

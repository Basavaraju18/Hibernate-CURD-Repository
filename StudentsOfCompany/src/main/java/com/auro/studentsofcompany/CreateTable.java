package com.auro.studentsofcompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateTable {
	public void createTable() {

		Students s1 = new Students();
		s1.setId(11);
		s1.setName("Arun");

		Students s2 = new Students();
		s2.setId(12);
		s2.setName("Bas");

		Students s3 = new Students();
		s3.setId(13);
		s3.setName("Charan");

		Students s4 = new Students();
		s4.setId(14);
		s4.setName("Darshan");

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Students.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);

		t.commit();
	}
}

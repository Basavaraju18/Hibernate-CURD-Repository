package com.auro.studentsofcompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UpdateStudent {

	public static void updateTTable() {
		try {	
			Configuration cfg = new Configuration().configure().addAnnotatedClass(Students.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();

			Students student = s.get(Students.class, 1);
			student.setName("Abhishek D B");

			t.commit();
		}
		catch (Exception e) {
			System.out.println("No i fuond");
			e.getMessage();
		}
	}
}

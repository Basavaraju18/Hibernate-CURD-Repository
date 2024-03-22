package com.auro.studentsofcompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadStudent {
	
	 void readStudent() {

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Students.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Students student = s.get(Students.class, 2);
		if(student != null) {
		System.out.println("Student ID is : "+student.getId());
		System.out.println("Student name is : "+student.getName());
		}
		else {
			System.out.println("Student is ni not there");
		}
		t.commit();
		
	}

}

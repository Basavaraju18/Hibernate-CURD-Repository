package com.auro.studentsofcompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteOpration {

	 void deleteOperation() {

		Configuration cfg = new Configuration();
			Configuration con = cfg.configure();
			con.addAnnotatedClass(Students.class);
			
			SessionFactory sf = con.buildSessionFactory();
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			
			Students student = s.get(Students.class,  1);
			
			if(student != null) {
				s.delete(student);
			}else {
				System.out.println("Student id not present in table");
			}
			
			t.commit();
	}
}

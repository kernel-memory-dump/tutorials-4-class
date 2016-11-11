package com.geowarin.hibernate.jpa.standalone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.jdt.annotation.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.geowarin.hibernate.jpa.standalone.model.Course;
import com.geowarin.hibernate.jpa.standalone.model.Student;
import com.geowarin.hibernate.jpa.standalone.model.User;

/**
 * Simple standalone JPA app.
 * Will load the user inserted by the script import-users.sql
 * 
 * @author Geoffroy Warin (https://github.com/geowarin)
 *
 */
public class App {
	
	private static Logger log = LoggerFactory.getLogger(App.class);
	
	public static void cannotBeNull(@Nonnull String x) {
		x.endsWith("1");
	}
	
	
	public static void main(String[] args) {
		cannotBeNull(null);
		System.exit(1);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		User found = entityManager.find(User.class, 1L);
		log.info("found=" + found);
		Student s = new Student();
		Course c = new Course();
		
		entityManager.getTransaction().begin();
		entityManager.persist(s);
	//	entityManager.persist(c);
		
		s.setCourse(c);
		entityManager.persist(s);
		//entityManager.merge(s);
		
		//entityManager.flush();
		
		entityManager.getTransaction().commit();
		
		
		
		

		
		
	}
}

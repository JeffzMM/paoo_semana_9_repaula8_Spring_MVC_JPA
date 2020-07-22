package com.example.model.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("jeffersonPU");
	}
	
	public static EntityManager getEntityManager () {
		return factory.createEntityManager();
	}
	
	public static void close () {
		factory.close();
	}
}

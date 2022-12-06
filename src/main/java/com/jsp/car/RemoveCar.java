package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveCar {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pranay");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	Car car =entityManager.find(Car.class,1);
	if(car!=null) {
		
		
		entityTransaction.begin();
        entityManager.remove(car);
         entityTransaction.commit();
         System.err.println("car gift dili");
         
	}
	else
	{System.err.println("BMW NAVTI MHANUN NAHI GHETLI");
}
}
}

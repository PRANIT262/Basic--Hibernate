package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetCar {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pranay");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	Car car=entityManager.find(Car.class,2);
if(car!=null) {
	System.err.println(car.getId());
	System.err.println(car.getName());
	System.err.println(car.getBrand());
	
}
else
{System.out.println("there is no car");
}

}
}

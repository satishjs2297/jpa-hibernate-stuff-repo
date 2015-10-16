package com.alti.jpa.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alti.jpa.hibernate.model.Employee;


@Repository
public class EmployeeDAO<T extends Employee> {

	@PersistenceContext(unitName = "ALTI_DBUNIT")
	private EntityManager eManager;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void persistEmployee(Object entity){
		eManager.persist(entity);
	}
	
	
}

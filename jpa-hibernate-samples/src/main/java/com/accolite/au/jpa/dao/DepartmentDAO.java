package com.accolite.au.jpa.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accolite.au.jpa.model.Department;
import com.accolite.au.jpa.model.Employee;
import com.accolite.au.jpa.model.ZEntity;


@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class DepartmentDAO<T extends Department> {

	@PersistenceContext(unitName = "ALTI_DBUNIT")
	private EntityManager eManager;

	public void persistDepartment(T entity){
		eManager.persist(entity);
	}
	
	public void mergeDepartment(T entity) {
		eManager.merge(entity);
	}

	public Serializable saveDepartment(T entity) {		
		Session session = (Session) eManager.getDelegate();
		return session.save(entity);
	}
	
	public void updateDepartment(T entity) {
		Session session = (Session) eManager.getDelegate();
		session.update(entity);
	}
	
}

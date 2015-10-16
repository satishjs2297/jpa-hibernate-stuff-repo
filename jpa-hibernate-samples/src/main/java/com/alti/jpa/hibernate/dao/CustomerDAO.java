package com.alti.jpa.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alti.jpa.hibernate.dao.rerpository.CustomerRepository;
import com.alti.jpa.hibernate.model.Account;
import com.alti.jpa.hibernate.model.Customer;


@Repository
public class CustomerDAO {
	
	@PersistenceContext(unitName="ALTI_DBUNIT")
	private EntityManager eManager;
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public CustomerDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerDAO(EntityManager eManager){
		this.eManager = eManager;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void persistCustomer(Object customer) {
		//eManager.getTransaction().begin();
			eManager.persist(customer);
		//eManager.getTransaction().commit();
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveCustomer(Customer customer){
		
		//customerRepo.save(customer);
		
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveAccount(Account account){
		eManager.persist(account);
	}

}

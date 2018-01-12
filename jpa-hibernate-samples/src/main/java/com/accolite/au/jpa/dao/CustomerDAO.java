package com.accolite.au.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accolite.au.jpa.dao.rerpository.CustomerRepository;
import com.accolite.au.jpa.model.Account;
import com.accolite.au.jpa.model.Customer;


@Repository
public class CustomerDAO <T extends Object> {
	
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
		eManager.persist(customer);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public Customer getCustomByIdAndCustName(Long custId, String custName) {
		//Customer customer = eManager.find(Customer.class, custId);
		Customer customer = customerRepo.findCustomerByCustIdAndCustName(custId, custName);
		System.out.println("customer :: "+customer);
		System.out.println("******************************");
		System.out.println("Account:: "+customer.getAccounts());
		return customer;
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

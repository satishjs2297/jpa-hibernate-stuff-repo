package com.alti.jpa.hibernate.dao.rerpository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alti.jpa.hibernate.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	//public Customer findCustomerByCustId(Long custId);
	

}

package com.accolite.au.jpa.dao.rerpository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accolite.au.jpa.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	public Customer findCustomerByCustIdAndCustName(Long custId, String custName);
	public Customer findCustomerByCustId(Long custId);
}

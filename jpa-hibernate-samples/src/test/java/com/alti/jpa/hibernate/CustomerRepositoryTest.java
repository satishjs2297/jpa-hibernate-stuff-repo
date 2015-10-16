package com.alti.jpa.hibernate;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alti.jpa.hibernate.dao.rerpository.CustomerRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/config/spring/jpaapplication-config.xml"})
public class CustomerRepositoryTest {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Test
	public void testFindCustomerByCustId(){
		assertNotNull(customerRepo);
		//Customer customer = customerRepo.findCustomerByCustId(new Long(1));
		//System.out.println("customer >> "+customer);
		
	}
	
	@Test
	public void testSaveCustomer(){
		assertNotNull(customerRepo);
		//customerRepo.save(new Customer("Srikanth Ramanujam", "Sr Project Manager"));
	}
	
	

}

package com.accolite.au.jpa;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accolite.au.jpa.dao.CustomerDAO;
import com.accolite.au.jpa.model.Account;
import com.accolite.au.jpa.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/config/spring/jpaapplication-config.xml"})
public class CustomerDAOTest {

	// create entityManager using JPA API & persistence.xml
	//private static EntityManagerFactory eManagerFactory = null;

	@BeforeClass
	public static void loadEManagerFactory() {
		//eManagerFactory = Persistence.createEntityManagerFactory("ALTI_DBUNIT");
	}

	@Before
	public void setUp() {
		//customerDAO = new CustomerDAO(eManagerFactory.createEntityManager());
	}

	@Autowired
	private CustomerDAO customerDAO = null;

	@Test
	public void testPersistCustomer() {
		Customer customer = new Customer("abc123", "Business holder");

		Account account = new Account("abc123", "Savings");
		Account account2 = new Account("abc123", "current", customer);
		account.setCustomer(customer);
		customer.getAccounts().add(account);
		customer.getAccounts().add(account2);
		customerDAO.persistCustomer(customer);
//		customerDAO.persistCustomer(account);
//		customerDAO.persistCustomer(account2);

	}
	
	@Test
	public void testGetCustomByIdAndCustName() {
		customerDAO.getCustomByIdAndCustName(7l, "abc123");
	}

	

}

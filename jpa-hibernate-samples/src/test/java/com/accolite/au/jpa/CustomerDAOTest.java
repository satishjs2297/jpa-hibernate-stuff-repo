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
		Customer customer = new Customer("Mani", "HouseWife");
		customerDAO.persistCustomer(customer);
		Account account = new Account("Mani", "Savings");
		account.setCustomer(customer);
		customer.getAccounts().add(account);
		customerDAO.persistCustomer(account);

	}

	/*@Ignore @Test
	public void testSaveCustomer() {
		
		EntityManager entityManager = eManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Stock stock = new Stock();
		stock.setStockCode("7052");
		stock.setStockName("PADINI");
		entityManager.persist(stock);
		
		StockDailyRecord stockDailyRecords = new StockDailyRecord();
		stockDailyRecords.setPriceOpen(new Float("1.2"));
		stockDailyRecords.setPriceClose(new Float("1.1"));
		stockDailyRecords.setPriceChange(new Float("10.0"));
		stockDailyRecords.setVolume(3000000L);
		stockDailyRecords.setDate(new Date());

		stockDailyRecords.setStock(stock);
		stock.getStockDailyRecords().add(stockDailyRecords);
		entityManager.persist(stockDailyRecords);
		
		entityManager.getTransaction().commit();
	}
	
	@Test
	public void testSaveCustomerwithAccount(){
		
		EntityManager entityManager = eManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Customer cust = new Customer("Veerraju", "Business");
		entityManager.persist(cust);
		
		Account account = new Account("IciciAccount", "Savings");
		account.setCustomer(cust);
		cust.getAccounts().add(account);
		
		entityManager.persist(account);
		
		entityManager.getTransaction().commit();
		
	}
*/
	

}

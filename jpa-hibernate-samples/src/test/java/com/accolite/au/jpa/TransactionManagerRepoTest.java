package com.accolite.au.jpa;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accolite.au.jpa.dao.rerpository.TransactionManagerRepo;
import com.accolite.au.jpa.model.TransactionManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/config/spring/jpaapplication-config.xml"})
public class TransactionManagerRepoTest {

	@Autowired
	private TransactionManagerRepo txManagerRepo;
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void testSaveTransaction() {
		TransactionManager txManager = new TransactionManager();
		txManager.setTxnName("abctxn");
		txManager.setTxnStatus("Active");
		txManagerRepo.save(txManager);
	}
}

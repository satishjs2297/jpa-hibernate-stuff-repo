package com.alti.jpa.hibernate;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alti.jpa.hibernate.dao.ABDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/config/spring/jpaapplication-config.xml"})
public class ABDAOTest {
	
	@Autowired
	private ABDAO abDao;
	
	@Ignore @Test
	public void testSingleTableInheritance(){
		abDao.persistAB();
	}
	
	@Test
	public void testTablePerClassInheritance(){
		abDao.persistPQ();
	}

}

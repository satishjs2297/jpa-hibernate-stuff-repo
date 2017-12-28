package com.accolite.au.jpa;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accolite.au.jpa.dao.PhoneDAO;
import com.accolite.au.jpa.model.Phone;
import com.accolite.au.jpa.model.PhoneMetaData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring/jpaapplication-config.xml"})
public class PhoneDAOTest {
	
	@Autowired
	private PhoneDAO phoneDAO;
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testPersistPhoneData(){
		Phone phone = new Phone("MotoG",null);
		phoneDAO.savePhoneData(phone);
		PhoneMetaData phoneMetaData = new PhoneMetaData("vig2297", "###33###");
		phoneMetaData.setPhone(phone);
		phone.setPhoneMetaData(phoneMetaData);
		phoneDAO.savePhoneData(phoneMetaData);
		
	}
	

}

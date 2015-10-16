/**
 * 
 */
package com.alti.jpa.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alti.jpa.hibernate.dao.rerpository.PhoneRepository;

/**
 * @author syandagudita
 *
 */
@Repository
public class PhoneDAO<T extends Object> {
	
	@PersistenceContext(unitName = "ALTI_DBUNIT")
	private EntityManager eManager;
	
	@Autowired
	private PhoneRepository phoneRepo;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void savePhoneData(T phoneData){
		eManager.persist(phoneData);
	}

}

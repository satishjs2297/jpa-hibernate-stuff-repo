package com.accolite.au.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accolite.au.jpa.model.B;
import com.accolite.au.jpa.model.Q;

@Repository
public class ABDAO {
	
	@PersistenceContext(unitName="ALTI_DBUNIT")
	private EntityManager eManager;
	
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void persistAB(){
		B b = new B("BPropValue");
		b.setSuperField("superfield");
		eManager.persist(b);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void persistPQ(){
		Q b = new Q("BPropValue","Test");
		b.setpName("PName");
		eManager.lock(b, LockModeType.READ);
		eManager.persist(b);
	}


}

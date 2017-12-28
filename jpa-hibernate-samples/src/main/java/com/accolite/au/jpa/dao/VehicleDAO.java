package com.accolite.au.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accolite.au.jpa.model.Vehicle;

@Repository
public class VehicleDAO {

	@PersistenceContext(unitName="ALTI_DBUNIT")
	private EntityManager eManager;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void persistVehicle(Vehicle vehicle){
		eManager.persist(vehicle);
	}
}

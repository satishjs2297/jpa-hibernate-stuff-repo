/**
 * 
 */
package com.accolite.au.jpa.model;

import javax.persistence.Entity;

/**
 * @author syandagudita
 * @Desc Table Per Concret Class Example
 */
@Entity
public class Truck extends TransportVehicle{

	private String truckCondition;
	
	public Truck() {
		// TODO Auto-generated constructor stub
	}
	
	public Truck(String truckCondition) {
		super();
		this.truckCondition = truckCondition;
	}



	public String getTruckCondition() {
		return truckCondition;
	}

	public void setTruckCondition(String truckCondition) {
		this.truckCondition = truckCondition;
	}
	
	
}

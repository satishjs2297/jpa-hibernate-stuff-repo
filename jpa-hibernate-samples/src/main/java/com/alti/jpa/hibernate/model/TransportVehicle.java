/**
 * 
 */
package com.alti.jpa.hibernate.model;

import javax.persistence.MappedSuperclass;

/**
 * @author syandagudita
 *
 */
@MappedSuperclass
public class TransportVehicle extends Vehicle{

	private String noOfWheels;
	
	private String loadCapacity;

	public String getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(String noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(String loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
}

/**
 * 
 */
package com.accolite.au.jpa.model;

import javax.persistence.MappedSuperclass;

/**
 * @author syandagudita
 *
 */
@MappedSuperclass
public class TransportVehicle extends Vehicle{
	private static final long serialVersionUID = -5831152353885218709L;

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

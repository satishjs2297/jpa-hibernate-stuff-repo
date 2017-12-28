/**
 * 
 */
package com.accolite.au.jpa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author syandagudita
 * @Desc Table Per Class (Concrete Class Example)
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Vehicle implements Serializable {
	
	
	private Integer vehicleId;
	
	private String vehicleName;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}

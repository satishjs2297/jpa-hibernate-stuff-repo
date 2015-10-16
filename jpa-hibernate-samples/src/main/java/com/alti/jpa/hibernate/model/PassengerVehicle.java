package com.alti.jpa.hibernate.model;

import javax.persistence.Entity;


@Entity
public class PassengerVehicle extends Vehicle {
	
	private String vechicleType;
	
	private String status;

	public String getVechicleType() {
		return vechicleType;
	}

	public void setVechicleType(String vechicleType) {
		this.vechicleType = vechicleType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}

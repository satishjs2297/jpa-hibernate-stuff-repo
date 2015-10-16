/**
 * 
 */
package com.alti.jpa.hibernate.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author syandagudita
 * Table Per class
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="joinDis")
public class P implements Serializable{

	private Integer pId;
	
	private String pName;
	
	public P() {
		// TODO Auto-generated constructor stub
	}
	
	

	public P(String pName) {
		super();
		this.pName = pName;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
}

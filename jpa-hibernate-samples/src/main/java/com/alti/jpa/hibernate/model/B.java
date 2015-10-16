/**
 * 
 */
package com.alti.jpa.hibernate.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author syandagudita
 *
 */
@Entity
@DiscriminatorValue(value="BValue")
public class B extends A implements Serializable {
	
	private Integer bId;
	
	private String subB;

	public B(String subB) {
		super();
		this.subB = subB;
	}
	
	public B() {
		// TODO Auto-generated constructor stub
	}

	
	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public String getSubB() {
		return subB;
	}

	public void setSubB(String subB) {
		this.subB = subB;
	}
	
	

}

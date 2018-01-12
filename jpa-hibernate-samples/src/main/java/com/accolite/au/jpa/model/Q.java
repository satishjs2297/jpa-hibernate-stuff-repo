/**
 * 
 */
package com.accolite.au.jpa.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author syandagudita
 *
 */
@Entity
@DiscriminatorValue("QJoined")
public class Q extends P {

	private String qName;
	
	private String qId;
	
	public Q() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Q(String qName, String qId) {
		super();
		this.qName = qName;
		this.qId = qId;
	}



	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public String getqId() {
		return qId;
	}

	public void setqId(String qId) {
		this.qId = qId;
	}
	
	public static void main(String[] args) {
		Q q = new Q();
		q.setpId(123);
		q.setpName("abc");
		
		q.setqId("44234");
		q.setqName("pqr");
		
	}
}
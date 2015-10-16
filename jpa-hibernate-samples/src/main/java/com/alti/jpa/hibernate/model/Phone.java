/**
 * 
 */
package com.alti.jpa.hibernate.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author syandagudita
 *
 */
@Entity
@Table(name = "Phone", catalog="vigdb")
public class Phone implements Serializable {
	
	private Integer phoneId;
	
	private String phoneName;
	
	private PhoneMetaData phoneMetaData;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	public Phone(String phoneName, PhoneMetaData phoneMetaData) {
		super();
		this.phoneName = phoneName;
		this.phoneMetaData = phoneMetaData;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy = "phone")
	public PhoneMetaData getPhoneMetaData() {
		return phoneMetaData;
	}

	public void setPhoneMetaData(PhoneMetaData phoneMetaData) {
		this.phoneMetaData = phoneMetaData;
	}

}

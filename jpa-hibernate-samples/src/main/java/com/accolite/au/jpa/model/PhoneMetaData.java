/**
 * 
 */
package com.accolite.au.jpa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author syandagudita
 *
 */
@Entity
@Table(name = "PHONEMETADATA")
public class PhoneMetaData implements Serializable {
	
	private Integer phoneId;
	
	private String phoneModel;
	
	private String phoneBarCode;
	
	private Phone phone;
	
	public PhoneMetaData() {
		// TODO Auto-generated constructor stub
	}
	
	
	public PhoneMetaData(String phoneModel, String phoneBarCode) {
		super();
		this.phoneModel = phoneModel;
		this.phoneBarCode = phoneBarCode;
	}


	
	@GenericGenerator(name = "generator", strategy = "foreign", 
	parameters = @Parameter(name = "property", value = "phone"))
	@Id
	@GeneratedValue(generator = "generator")
	public Integer getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public String getPhoneBarCode() {
		return phoneBarCode;
	}

	public void setPhoneBarCode(String phoneBarCode) {
		this.phoneBarCode = phoneBarCode;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Phone getPhone() {
		return phone;
	}


	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}

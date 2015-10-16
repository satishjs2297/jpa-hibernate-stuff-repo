package com.alti.jpa.hibernate.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT",catalog="vigdb")
public class Account implements Serializable {

	
	private Long acctNo;
	
	private String acctName;
	
	private String acctType;
	
	private Customer customer;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String acctName, String acctType) {
		super();
		this.acctName = acctName;
		this.acctType = acctType;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(Long acctNo) {
		this.acctNo = acctNo;
	}

	public String getAcctName() {
		return this.acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "CUSTID", nullable=false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}

package com.accolite.au.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="TRANSACTION_MANAGER")
public class TransactionManager {

	private String txnId;
	private String txnName;
	private String txnStatus;
	
	@Id
	@GenericGenerator(name="assigned-sequence", strategy="com.accolite.au.jpa.model.generator.TxnIdGenerator")
	@GeneratedValue(generator="assigned-sequence")
	public String getTxnId() {
		return txnId;
	}
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
	public String getTxnName() {
		return txnName;
	}
	public void setTxnName(String txnName) {
		this.txnName = txnName;
	}
	public String getTxnStatus() {
		return txnStatus;
	}
	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}
}

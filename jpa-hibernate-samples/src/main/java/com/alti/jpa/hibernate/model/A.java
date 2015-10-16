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
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="p_type")
public class A implements Serializable {
	
	private Integer aId;
	
	private String superField;
	
	public A(String superField) {
		super();
		this.superField = superField;
	}

	public A() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public String getSuperField() {
		return superField;
	}

	
	public void setSuperField(String superField) {
		this.superField = superField;
	}
	
}

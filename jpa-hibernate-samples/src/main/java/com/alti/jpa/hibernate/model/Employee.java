/**
 * 
 */
package com.alti.jpa.hibernate.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.JoinColumnOrFormula;

/**
 * @author syandagudita
 *
 */
@Entity
@Table(name="EMPLOYEE",catalog = "vigdb")
public class Employee implements Serializable {
	
	
	private Integer empId;
	
	private String empName;
	
	private String empAge;
	
	private String empStatus;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empName, String empAge, String empStatus) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empStatus = empStatus;
		//this.deparments = deparments;
	}


	private Set<Department> deparments = new HashSet<Department>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	@ManyToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name = "EMPDEPT_JOINTB", catalog = "vigdb", joinColumns = {
		@JoinColumn(name = "empId",nullable = false, updatable = true) },
		inverseJoinColumns = { @JoinColumn(name = "deptId", nullable = false, updatable = true)}
	)
	public Set<Department> getDeparments() {
		return deparments;
	}

	public void setDeparments(Set<Department> deparments) {
		this.deparments = deparments;
	}


	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAge() {
		return empAge;
	}

	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	

}

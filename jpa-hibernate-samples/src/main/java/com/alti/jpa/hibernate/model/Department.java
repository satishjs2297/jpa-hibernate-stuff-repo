/**
 * 
 */
package com.alti.jpa.hibernate.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author syandagudita
 *
 */
@Entity
@Table(name = "Department",catalog = "vigdb")
public class Department implements Serializable {
	
	private Integer deptId;
	
	private String deptName;
	
	private String deptStatus;
	
	private Set<Employee> employees = new HashSet<Employee>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Department(String deptName, String deptStatus) {
		super();
		this.deptName = deptName;
		this.deptStatus = deptStatus;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "deparments")
	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}


	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptStatus() {
		return deptStatus;
	}

	public void setDeptStatus(String deptStatus) {
		this.deptStatus = deptStatus;
	}
	
	

}

package com.accolite.au.jpa;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accolite.au.jpa.dao.DepartmentDAO;
import com.accolite.au.jpa.dao.EmployeeDAO;
import com.accolite.au.jpa.model.Department;
import com.accolite.au.jpa.model.Employee;

/**
 * @author syandagudita
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring/jpaapplication-config.xml"})
public class EmployeeDAOTest {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	private DepartmentDAO<Department> deptDAO;

	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testPersistEmployee(){
		Employee employee = new Employee("Veerraju", "29", "Active");
		employeeDAO.persistEmployee(employee);
		Department dept = new Department("IT", "Active");
		dept.getEmployees().add(employee);
		employee.getDeparments().add(dept);
		deptDAO.persistDepartment(dept);
	}
	
	
}

/**
 * 
 */
package com.alti.jpa.hibernate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alti.jpa.hibernate.dao.EmployeeDAO;
import com.alti.jpa.hibernate.model.Department;
import com.alti.jpa.hibernate.model.Employee;

/**
 * @author syandagudita
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring/jpaapplication-config.xml"})
public class EmployeeDAOTest {
	
	@Autowired
	private EmployeeDAO employeeDAO;

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
		employeeDAO.persistEmployee(dept);
	}
	
	
}

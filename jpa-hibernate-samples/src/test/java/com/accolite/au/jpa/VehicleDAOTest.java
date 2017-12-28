package com.accolite.au.jpa;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accolite.au.jpa.dao.VehicleDAO;
import com.accolite.au.jpa.model.PassengerVehicle;
import com.accolite.au.jpa.model.Truck;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/config/spring/jpaapplication-config.xml"})
public class VehicleDAOTest {

	@Autowired
	private VehicleDAO vehicleDAO;
	
	@Ignore @Test
	public void testPersistVehicle(){
		PassengerVehicle pVehicle = new PassengerVehicle();
		pVehicle.setStatus("A");
		pVehicle.setVechicleType("Car");
		pVehicle.setVehicleName("Ford");
		vehicleDAO.persistVehicle(pVehicle);
	}
	
	@Test
	public void testPersistTruck(){
		Truck truck = new Truck("Working");
		truck.setLoadCapacity("20000");
		truck.setNoOfWheels("16");
		truck.setVehicleName("Tata Industries");
		vehicleDAO.persistVehicle(truck);
	}
}

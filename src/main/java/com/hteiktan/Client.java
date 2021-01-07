package com.hteiktan;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.hteiktan.dto.EmployeeDTO;
import com.hteiktan.service.EmployeeServiceImpl;
import com.infy.util.SpringConfiguration;

public class Client {

	public static void main(String[] args) {
		EmployeeServiceImpl service = null;
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		service = context.getBean(EmployeeServiceImpl.class);
		
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmpId(102);
		employeeDTO.setEmpName("Mini");
		employeeDTO.setDepartment("ETA");
		service.insert(employeeDTO);
		List<EmployeeDTO> list = service.getAllEmployee();
		System.out.println("After adding.....");
		for (EmployeeDTO e: list) {
			System.out.println(e.getEmpName());
		}
	
		service.delete(1);
		System.out.println("After deleting Mini.....");
		List<EmployeeDTO> list2 = service.getAllEmployee();
		for (EmployeeDTO e: list2) {
			System.out.println(e.getEmpName());
		}
		
	}
}

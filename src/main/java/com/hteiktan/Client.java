package com.hteiktan;

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
		
		service.insert(new EmployeeDTO());
		service.delete(123);
	}
}

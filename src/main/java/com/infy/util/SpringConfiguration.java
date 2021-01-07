package com.infy.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hteiktan.repository.EmployeeRepositoryImpl;
import com.hteiktan.service.EmployeeServiceImpl;

@Configuration
public class SpringConfiguration {
	
	@Bean(name = "employeeService")
	public EmployeeServiceImpl employeeServiceImpl() {
		return new EmployeeServiceImpl(employeeRepositoryImpl());
	}
	
	@Bean(name = "employeeRepository")
	public EmployeeRepositoryImpl employeeRepositoryImpl() {
		return new EmployeeRepositoryImpl();
	}
}

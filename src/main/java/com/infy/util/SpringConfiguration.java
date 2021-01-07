package com.infy.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hteiktan.service.EmployeeServiceImpl;

@Configuration
public class SpringConfiguration {
	
	@Bean(name = "employeeService")
	public EmployeeServiceImpl employeeServiceImpl() {
		return new EmployeeServiceImpl();
	}
}

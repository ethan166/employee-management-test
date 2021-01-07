package com.hteiktan.service;

import com.hteiktan.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {

	public void insert(EmployeeDTO emp) {
		System.out.println("Inserted");
	}

	public void delete(int empId) {
		System.out.println("Deleted");
	}

}

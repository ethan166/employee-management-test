package com.hteiktan.service;

import com.hteiktan.dto.EmployeeDTO;

public interface EmployeeService {
	public void insert(EmployeeDTO emp);
	public void delete(int empId);
}

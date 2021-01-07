package com.hteiktan.service;

import java.util.List;

import com.hteiktan.dto.EmployeeDTO;
import com.hteiktan.repository.EmployeeRepository;
import com.hteiktan.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository employeeDAO;
	
	public EmployeeServiceImpl(EmployeeRepository employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	public void insert(EmployeeDTO emp) {
		employeeDAO.insertEmployee(emp);
	}

	public void delete(int empId) {
		employeeDAO.removeEmployee(empId);
	}

	public List<EmployeeDTO> getAllEmployee() {
		return employeeDAO.fetchEmployee();
	}
	

}

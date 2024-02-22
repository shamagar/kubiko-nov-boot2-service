package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.EmployeeEntity;
import com.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeEntity findBymailPass(String email, String pswd) {
		
		EmployeeEntity employeeEntity=employeeRepository.findByEmailidAndPassword(email, pswd);
		
		
		return employeeEntity;
	}

	@Override
	public void saveEmp(EmployeeEntity employeeEntity) {
		
		employeeRepository.save(employeeEntity);
		
	}
}

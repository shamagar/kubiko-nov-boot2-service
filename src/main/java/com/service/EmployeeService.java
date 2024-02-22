package com.service;

import com.entity.EmployeeEntity;

public interface EmployeeService {

	EmployeeEntity findBymailPass(String email, String pswd);

	void saveEmp(EmployeeEntity employeeEntity);

}

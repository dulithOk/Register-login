package com.example.anglogin.service;

import com.example.anglogin.dto.EmployeeDTO;
import com.example.anglogin.dto.LoginDTO;
import com.example.anglogin.response.LoginResponse;

public interface EmployeeService {
	
	String addEmployee(EmployeeDTO employeeDTO);
	
	LoginResponse loginEmployee(LoginDTO loginDTO);

}

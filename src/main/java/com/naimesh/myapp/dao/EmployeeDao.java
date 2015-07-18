package com.naimesh.myapp.dao;

import java.util.List;

import com.naimesh.myapp.domain.EmployeeDetail;

public interface EmployeeDao {
	public void addEmployee(EmployeeDetail employeeDetails);
	public List<EmployeeDetail> listOfEmployees();
	public EmployeeDetail getEmployee(String eId);
	public void deleteEmployee(String empId);
}

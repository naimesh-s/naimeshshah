package com.naimesh.myapp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.naimesh.myapp.dao.EmployeeDao;
import com.naimesh.myapp.domain.EmployeeDetail;

@Service("employeeService")
@Transactional	
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public void addEmployeeDetail(EmployeeDetail employeeDetail){
		employeeDao.addEmployee(employeeDetail);
	}
	
	public List<EmployeeDetail> listOfEmployees(){
		return employeeDao.listOfEmployees();
	}
	
	public EmployeeDetail getEmployee(String empId){
		return employeeDao.getEmployee(empId);
	}
	
	public void deleteEmployee(String empId) {
		employeeDao.deleteEmployee(empId);
	}
}

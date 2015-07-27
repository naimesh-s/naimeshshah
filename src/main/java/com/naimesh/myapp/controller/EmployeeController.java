package com.naimesh.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.naimesh.myapp.domain.EmployeeDetail;
import com.naimesh.myapp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/save-update", method = RequestMethod.POST)
	public ResponseEntity<String> saveAndUpdateEmployee(@RequestBody(required = true) EmployeeDetail employeeDetail){
		employeeService.addEmployeeDetail(employeeDetail);
		return new ResponseEntity<String>("Successfully created or updated ..!!",HttpStatus.CREATED);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/employeeslist", method = RequestMethod.POST)
	public ResponseEntity<EmployeeDetail> fetchEmployeeDetails(){
		List<EmployeeDetail> employeeDetails = employeeService.listOfEmployees();
		return new ResponseEntity(employeeDetails, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ResponseEntity<String> deleteEmployee(@RequestParam String empId){
		employeeService.deleteEmployee(empId);
		return new ResponseEntity<String>("Successfully deleted the employee record ..!!",HttpStatus.OK);
	}
}

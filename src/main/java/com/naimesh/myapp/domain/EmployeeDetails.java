package com.naimesh.myapp.domain;

import lombok.Getter;
import lombok.Setter;


@Getter

public class EmployeeDetails {
	
	@Setter
	private String empId;
	private String empName;
	private String empMailId;
	private String empContactNumber;
	private String empAddress;
	private String empBranch;
}

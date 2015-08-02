package com.naimesh.myapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Employee")
public class EmployeeDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="empId", unique=true)
	private String empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empMailId")
	private String empMailId;
	
	@Column(name="empContactNumber")
	private String empContactNumber;
	
	@Column(name="empAddress")
	private String empAddress;
	
	@Column(name="empBranch")
	private String empBranch;
	
	@Column(name = "empAge")
	private String empAge;
}

package com.example.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
    @Column(name="EID")
	Long empId;
	
	@Column(name="ENAME")
	String empName;
	
	@Column(name="EEMAIL", nullable=false, length=200)
	String empEmail;
	
	@Column(name="ECONTACTDETAILS")
	String empContactDetails;
	
	@Column(name="EDESIGNATION")
	String empDesignation;
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpContactDetails() {
		return empContactDetails;
	}
	public void setEmpContactDetails(String empContactDetails) {
		this.empContactDetails = empContactDetails;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	
	
	
}

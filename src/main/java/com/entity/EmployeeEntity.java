package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {
	
private int empid;	
private String empname;
private String emailid;
private String password;
private int salary;
private String role;

public EmployeeEntity() {
	super();
	// TODO Auto-generated constructor stub
}

public EmployeeEntity( String empname, String emailid, String password, int salary, String role) {
	super();
	
	this.empname = empname;
	this.emailid = emailid;
	this.password = password;
	this.salary = salary;
	this.role = role;
}

@Id
@GeneratedValue

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

@Override
public String toString() {
	return "EmployeeEntity [empid=" + empid + ", empname=" + empname + ", emailid=" + emailid + ", password=" + password
			+ ", salary=" + salary + ", role=" + role + "]";
}



}

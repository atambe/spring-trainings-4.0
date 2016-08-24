package com.cg.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private Date hireDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", id=" + id
				+  ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}
}

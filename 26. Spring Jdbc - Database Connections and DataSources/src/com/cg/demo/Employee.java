package com.cg.demo;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	private List<JobHistory> jobHistory = new ArrayList<JobHistory>();

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
	
	public List<JobHistory> getJobHistory() {
		return jobHistory;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", id=" + id
				+ ", jobHistory=" + jobHistory + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}
}

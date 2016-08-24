package com.cg.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{
	private String name;
	private Department department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [department=" + department + ", name=" + name + "]";
	}

	/*	public void init(){
		System.out.println("Initializing bean");

		if(department==null){
				department = new Department("Bench");
		}
		if(name==null)
			throw new RuntimeException("You must provide name for every employee");
	}
	 */	
	 public void afterPropertiesSet() throws Exception {
		 // TODO Auto-generated method stub
		 System.out.println("Initializing bean");

		 if(department==null){
			 department = new Department("Bench");
		 }
		 if(name==null)
			 throw new RuntimeException("You must provide name for every employee");

	 }
	 
	 public void destroy() throws Exception {
		 // TODO Auto-generated method stub
		 System.out.println("Bean is being destroyed");
	 }
}

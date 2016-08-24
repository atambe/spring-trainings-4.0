package com.cg.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;

public class Employee implements BeanNameAware{
	private String beanName;
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
	
	@PostConstruct
	public void init(){
		System.out.println("Initializing bean :: "+beanName);
		
		if(department==null){
				department = new Department("Bench");
		}
		if(name==null)
			throw new RuntimeException("You must provide name for every employee");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println(beanName+" Bean is being destroyed");
	}
	
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		this.beanName=beanName;
	}
}

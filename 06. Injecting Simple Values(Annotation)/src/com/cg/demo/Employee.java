package com.cg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("Renu")
	private String name;
	@Value("8")
	private int age;
	@Value("3.2")
	private float height;
	@Value("true")
	private boolean programmer;
	@Autowired
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isProgrammer() {
		return programmer;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", department=" + department
				+ ", height=" + height + ", name=" + name + ", programmer="
				+ programmer + "]";
	}
	
}

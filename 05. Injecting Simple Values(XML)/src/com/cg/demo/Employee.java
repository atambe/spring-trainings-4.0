package com.cg.demo;

public class Employee {
	private String name;
	private int age;
	private float height;
	private boolean programmer;
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

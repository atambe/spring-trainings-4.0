package com.cg.demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class Employee {
	private String name;
	private Map<String, Address>address;
	private Set<Project> projects;
	private List<Phone> phones;
	private Properties family;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Address> getAddress() {
		return address;
	}
	public void setAddress(Map<String, Address> address) {
		this.address = address;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	public List<Phone> getPhones() {
		return phones;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	public Properties getFamily() {
		return family;
	}
	public void setFamily(Properties family) {
		this.family = family;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + ", family=" + family
				+ ", name=" + name + ", phones=" + phones + ", projects="
				+ projects + "]";
	}
	
}

package com.cg.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service("department")
public class Department {
	@Value("TDE Java")
	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
}

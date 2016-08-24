package com.cg.demo;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;


public class JdbcDao {
	private DataSource dataSource;
	private UpdateEmployee updateEmployee;
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
		this.updateEmployee = new UpdateEmployee(dataSource);
	}
	
	public void update(Employee e){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("first_name", e.getFirstName());
		paramMap.put("last_name", e.getLastName());
		paramMap.put("hire_date", e.getHireDate());
		paramMap.put("employee_id", e.getId());
		
		updateEmployee.updateByNamedParam(paramMap);
	}
}

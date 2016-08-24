package com.cg.demo;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class UpdateEmployee extends SqlUpdate {

	private static final String UPDATE_EMPLOYEE="update Employees set first_name = :first_name, last_name = :last_name, " +
			"hire_date=:hire_date where employee_id = :employee_id"; 
	
	public UpdateEmployee(DataSource dataSource){
		super(dataSource,UPDATE_EMPLOYEE);
		super.declareParameter(new SqlParameter("first_name",Types.VARCHAR));
		super.declareParameter(new SqlParameter("last_name",Types.VARCHAR));
		super.declareParameter(new SqlParameter("hire_date",Types.DATE));
		super.declareParameter(new SqlParameter("employee_id",Types.INTEGER));
	}
}

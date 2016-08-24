package com.cg.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class JdbcDao {
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	// Retrieving Single-Value-Use JdbcTemplate Class
	public String findFirstNameById(int id){
		String firstName =jdbcTemplate.queryForObject("select first_name from employees where employee_id = ?", new Object[]{id}, String.class);
		return firstName;
	}
	
	// Using Named Parameters with NamedParameterJdbc Template
	
	public String findLastNameById(int id){
		
		String sql = "Select last_name from employees where employee_id= :employeeId";
		SqlParameterSource namedParameter = new MapSqlParameterSource("employeeId", id);
		return namedParameterJdbcTemplate.queryForObject(sql,namedParameter, String.class);
	}
	
	// Instead of SqlParameterSource, a Map can be used to store named parameters 
	
	public int findSalaryById(int id){
		String sql = "Select salary from employees where employee_id= :employeeId";
		Map<String, Object> namedParameter = new HashMap<String,Object>();
		namedParameter.put("employeeId",id);
		return namedParameterJdbcTemplate.queryForObject(sql,namedParameter, Integer.class);
	}
	
	// Retrieving Domain Objects with RowMapper<T>
	
	public List<Employee> findAll(){
		
		String sql = "Select employee_id,first_name,last_name,salary from employees";
		return jdbcTemplate.query(sql, new RowMapper<Employee>(){
			
			public Employee mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				// TODO Auto-generated method stub
				Employee e = new Employee();
				e.setId(rs.getInt("employee_id"));
				e.setFirstName(rs.getString("first_name"));
				e.setLastName(rs.getString("last_name"));
				e.setSalary(rs.getInt("salary"));
				return e;
			}
		});
	}
	
	// Retrieving Nested Domain Objects with ResultSetExtractor
	
	public List<Employee> findAllWithJobHistory(){
			String sql = "select e.employee_id, e.first_name, e.last_name, e.salary, j.start_date, j.end_date, " +
					"j.job_id from employees e, job_history j where e.employee_id = j.employee_id	";
			return jdbcTemplate.query(sql, new ResultSetExtractor<List<Employee>>(){

				public List<Employee> extractData(ResultSet rs)
						throws SQLException, DataAccessException {
					// TODO Auto-generated method stub
					Map<Integer,Employee> map = new HashMap<Integer,Employee>();
					Employee e = null;
					while(rs.next()){
						int id = rs.getInt("employee_id");
						e = map.get(id);
						if(e==null){
							 e = new Employee();
							 e.setId(id);
							 e.setFirstName(rs.getString("first_name"));
							 e.setLastName(rs.getString("last_Name"));
							 e.setSalary(rs.getInt("salary"));
							 map.put(id, e);
						}
						
						JobHistory jh = new JobHistory();
						jh.setJobId(rs.getString("job_id"));
						jh.setStartDate(rs.getDate("start_date"));
						jh.setEndDate(rs.getDate("end_date"));
						e.getJobHistory().add(jh);
					}
					return new ArrayList<Employee>(map.values()) ;
				}});
			
	}
}

package com.qedge.sep11.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.qedge.sep11.constant.Constants;
import com.qedge.sep11.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private JdbcTemplate template = null;
	
	public EmployeeDaoImpl() {
		
	}
	
	public EmployeeDaoImpl(DataSource dataSource) {
		template = new JdbcTemplate(dataSource);
	}
	
	public void setDataSource(DataSource dataSource) {
		template = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveEmployee(Employee emp) {
		template.update(Constants.INSERT,new Object[] {emp.getEmpId(),emp.getName(),emp.getSalary(),emp.getAddress()});
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		template.update(Constants.UPDATE,new Object[] {emp.getName(),emp.getSalary(),emp.getAddress(),emp.getEmpId()});
		
	}

	@Override
	public void deleteEmployee(Integer empId) {
		template.update(Constants.DELETE,new Object[] {empId});
		
	}

	@Override
	public Employee getOneEmployee(Integer empId) {
		List<Employee> emps =  template.query(Constants.GET_ONE,new Object[] {empId}, new EmployeeRowMapper());
		return emps.get(0);
	}

	@Override
	public List<Employee> getAllEmployees(Integer empId) {
		List<Employee> emps =  template.query(Constants.GET_ALL, new EmployeeRowMapper());
		return emps;
	}

	
	
}

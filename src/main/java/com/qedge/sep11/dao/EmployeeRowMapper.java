package com.qedge.sep11.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.qedge.sep11.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpId(rs.getInt("emp_id"));
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getInt("salary"));
		emp.setAddress(rs.getString("address"));
		return emp;
	}

}

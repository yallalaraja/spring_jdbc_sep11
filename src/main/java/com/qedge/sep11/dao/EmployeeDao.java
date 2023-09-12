package com.qedge.sep11.dao;

import java.util.List;

import com.qedge.sep11.model.Employee;

public interface EmployeeDao{
	public void saveEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(Integer empId);
	public Employee getOneEmployee(Integer empId);
	public List<Employee> getAllEmployees(Integer empId);
	
}

package com.qedge.sep11.model;

public class Employee {
	private Integer empId;
	private String name;
	private Integer salary;
	private String address;
	public Employee(Integer empId, String name, Integer salary, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
}

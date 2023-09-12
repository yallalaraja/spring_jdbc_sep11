package com.qedge.sep11.constant;

public class Constants {
	public final static String INSERT = "insert into employee values (?,?,?,?)";
	public final static String UPDATE = "update employee set name=?,salary=?,address=? where Emp_id=?";
	public final static String DELETE = "delete from employee where Emp_id=?";
	public final static String GET_ONE = "select * from employee where Emp_id=?";
	public final static String GET_ALL = "select * from employee";
 }

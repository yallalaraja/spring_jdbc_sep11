package com.qedge.sep11.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qedge.sep11.dao.EmployeeDao;
import com.qedge.sep11.model.Employee;

public class TestJdbc {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeDao dao = ctx.getBean("dao",EmployeeDao.class);
//		for(int i=7;i<=15;i++) {
//		Employee emp = new Employee(i,"arun-"+i,12000,"sr nagar");
//		dao.saveEmployee(emp);
//		}
		
//		Employee emp = new Employee(9,"Kumar",15000,"Gachibowli");
//		dao.updateEmployee(emp);
//		System.out.println("Updated data successfully");
//		dao.deleteEmployee(6);
//		System.out.println("deleted successfully");
		
		for(Employee emp:dao.getAllEmployees(null)) {
			System.out.println(emp);
		}
		
//		System.out.println("Employee is saved");
	}

}

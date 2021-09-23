package com.src.main;

import java.awt.print.Book;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.dao.EmpDAO;
import com.src.model.Employee;

public class MainApplicationEmp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDAO dao = (EmpDAO) context.getBean("empdao");
		/*
		 * int status = dao.insertEmployee(new
		 * Employee(20,"vishaali","IT","staff",30000)); int status1 =
		 * dao.insertEmployee(new Employee(21,"narain","mech","manager",40000)); if
		 * (status> 0) { System.out.println("inserted  sucessfully"); }
		 * 
		 * else { System.out.println("unsucessfull insertion"); } if (status1> 0) {
		 * System.out.println("inserted  sucessfully"); }
		 * 
		 * else { System.out.println("unsucessfull insertion"); }
		 */
		/*
		 * int status=dao.updateEmployee(new
		 * Employee(21,"anushaa","ece","staff",30000)); if (status> 0) {
		 * System.out.println("updated  sucessfully"); }
		 * 
		 * else { System.out.println("unsucessfull updation"); }
		 */
		/*int status = dao.deleteEmployee(new Employee(21));
		if (status > 0) {
			System.out.println("deleted  sucessfully");
		}

		else {
			System.out.println("unsucessfull deletetion");
		}*/
		List<Employee> status = dao.displayAllEmployee();
		for(Employee x:status)
		{
			System.out.println(x);
		}

	}
}

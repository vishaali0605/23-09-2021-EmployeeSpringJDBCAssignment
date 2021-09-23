package com.src.dao;

import java.util.List;

import com.src.model.Employee;

public interface EmpDAOInterface {
	public int insertEmployee(Employee e);
	public int updateEmployee(Employee e);
	public int deleteEmployee(Employee e);
	public List<Employee> displayAllEmployee();
}

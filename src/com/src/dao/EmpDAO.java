package com.src.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.src.model.Employee;

public class EmpDAO implements EmpDAOInterface {
	private JdbcTemplate jdbctemp;

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;

	}

	@Override
	public int insertEmployee(Employee e) {
		String query = "insert into Employee values(" + e.getEmpid() + ",'" + e.getEmpname() + "','" + e.getEmpdept()
				+ "','" + e.getEmpdesg() + "'," + e.getEmpsalary() + ")";
		return jdbctemp.update(query);
	}

	@Override
	public int updateEmployee(Employee e) {
		String query = "update employee set empname='" + e.getEmpname() + "',empdept='" + e.getEmpdept() + "',empdesg='"
				+ e.getEmpdesg() + "',empsalary=" + e.getEmpsalary() + " where empid=" + e.getEmpid();
		return jdbctemp.update(query);
	}

	@Override
	public int deleteEmployee(Employee e) {
		String query = "delete from employee where empid=" + e.getEmpid();
		return jdbctemp.update(query);
	}

	@Override
	public List<Employee> displayAllEmployee() {
		return jdbctemp.query("select*from employee", (rs, row) -> {
			Employee e = new Employee();
			e.setEmpid(rs.getInt(1));
			e.setEmpname(rs.getString(2));
			e.setEmpdept(rs.getString(3));
			e.setEmpdesg(rs.getString(4));
			e.setEmpsalary(rs.getInt(5));
			return e;

		});
	}

}

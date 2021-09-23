package com.src.model;

public class Employee {
	private int empid;
	private String empname;
	private String empdept;
	private String empdesg;
	private int empsalary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	public String getEmpdesg() {
		return empdesg;
	}
	public void setEmpdesg(String empdesg) {
		this.empdesg = empdesg;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public Employee(int empid, String empname, String empdept, String empdesg, int empsalary) {
		
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
		this.empdesg = empdesg;
		this.empsalary = empsalary;
	}
	public Employee() {
		
	}
	public Employee(int empid) {
		
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + ", empdesg=" + empdesg
				+ ", empsalary=" + empsalary + "]";
	}
	
	

}

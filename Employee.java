package com.deloitte.employee;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private String deptId;
	Employee(){
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		String pattern="^[A-Za-z]+$";
		if(empName.matches(pattern))
		this.empName = empName;
		else
			System.out.println("plz enter name");
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	Employee(int empId,String empName,double salary,String deptId){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.deptId=deptId;
	}
public void deptChange(String deptName) {
	System.out.println("inside method");
}
}

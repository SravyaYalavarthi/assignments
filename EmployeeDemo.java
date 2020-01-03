package com.deloitte.employee;
import java.util.Scanner;
public class EmployeeDemo {
	public static void main(String args[]) {
		Scanner scr=new Scanner(System.in);
		System.out.println("please enter name");
		String name=scr.next();
		System.out.println("please enter salary");
		String Salary=scr.next();
		boolean flagname=utilities.nameValidation(name);
		boolean flagsalary=utilities.salaryValidation(Salary);
		if(flagname&&flagsalary)
		{
			Employee emp=new Employee();
			emp.setEmpName(name);
			emp.setEmpId(101);
			emp.setSalary(Double.parseDouble(Salary));
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());	
		}
		
		if(utilities.nameValidation(name)) {
			Employee emp3=new Employee();
			emp3.setEmpName(name);
			emp3.setDeptId("aa");
			System.out.println(emp3.getEmpName());
			System.out.println(emp3.getDeptId());
		}
		Employee emp3=new Employee();
		emp3.setDeptId("aa");
		Employee emp2=new Employee(101,"zinat",25000,"se");
		System.out.println(emp2.getEmpId());
		
	}

}

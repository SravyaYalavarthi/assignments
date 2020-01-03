package com.deloitte.designationProject.main;
import com.deloitte.designationProject.model.personalDetails;
import com.deloitte.designationProject.services.personalDetailsimpl;

import java.util.*;
public class personalDetailsDemo {
public static void main(String args[])	{
	Scanner sc=new Scanner(System.in);
	ArrayList<personalDetails> list=new ArrayList<personalDetails>();
	while(true) {
	System.out.println("option1 to add a student"+"option2 to display a student"+"option3 to login"
	+"option4 to exit");
	String option=sc.next();
	personalDetailsimpl mainobject=new personalDetailsimpl();
	switch(option) {
	case "1":
		System.out.println("enter userID");
		String userId=sc.next();
		System.out.println("enter emailid");
		String emailId=sc.next();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter fathers name");
		String fathersName=sc.next();
		System.out.println("enter mothers name");
		String mothersName=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		System.out.println("enter contactno");
		String contactno=sc.next();
		System.out.println("enter gender");
		String gender=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		mainobject.addstudent(userId, emailId, name, fathersName, mothersName, address, contactno, gender, password);
	break;
	case "2":
		list= mainobject.displaystudents();
		for(personalDetails liobj:list)
			System.out.println(liobj);
		break;
	case "3":
		System.out.println("enter emailid");
		String emailid=sc.next();
		System.out.println("enter password");
		String password1=sc.next();
		mainobject.login(emailid, password1);
		break;
	case "4":
		System.exit(0);
	}
	
}
	}
}

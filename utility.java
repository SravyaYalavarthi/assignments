package com.deloitte.employee;
public class utility {
	public static boolean nameValidation(String name) {
		String pattern="^[A-Za-z]+$";
		if(name.matches(pattern))
		return true;
		else
			System.out.println("name should be in alphabets");
		return false;
	}
	public static boolean idValidation(String id) {
		String pattern="^[0-9]{4}$";
		if(id.matches(pattern))
			return true;
		else
		return false;
	}

}

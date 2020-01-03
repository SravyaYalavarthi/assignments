package com.deloitte.designationProject.services;

import java.util.ArrayList;

import com.deloitte.designationProject.model.personalDetails;

public interface personalDetailsInterface{
	public void addstudent(String userId,String emailId,String name,String fathersName,String mothersName,String address,String contactno,String gender,String password);
	public ArrayList<personalDetails> displaystudents();
	public void login(String emailid,String password1);
}

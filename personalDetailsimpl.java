package com.deloitte.designationProject.services;

import java.util.ArrayList;

import com.deloitte.designationProject.dao.personalDAO;
import com.deloitte.designationProject.model.personalDetails;

public class personalDetailsimpl implements personalDetailsInterface {
	public void addstudent(String userId,String emailId,String name,String fathersName,String mothersName,String address,String contactno,String gender,String password) {
		personalDetails pd=new personalDetails();
		pd.setUserID(Integer.parseInt(userId));
		pd.setEmailId(emailId);
		pd.setName(name);
		pd.setFathersName(fathersName);
		pd.setMothersName(mothersName);
		pd.setAddress(address);
		pd.setContactno(Long.parseLong(contactno));
		pd.setGender(gender);
		pd.setPassword(password);
		personalDAO.addstudent(pd);
	}

	@Override
	public ArrayList<personalDetails> displaystudents() {
		// TODO Auto-generated method stub
		return personalDAO.displaystudents();
	}

	@Override
	public void login(String emailid, String password1) {
		// TODO Auto-generated method stub
		 personalDAO.login(emailid,password1);
}


}


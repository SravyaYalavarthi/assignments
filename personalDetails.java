package com.deloitte.designationProject.model;

public class personalDetails {
	private int userID;
	private String emailId;
	private String name;
	private String fathersName;
	private String mothersName;
	private String address;
	private long contactno;
	private String gender;
	private String password;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "personalDetails [userID=" + userID + ", emailId=" + emailId + ", name=" + name + ", fathersName="
				+ fathersName + ", mothersName=" + mothersName + ", address=" + address + ", contactno=" + contactno
				+ ", gender=" + gender + ", password=" + password + "]";
	}

}

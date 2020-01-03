package com.deloitte.employee;

public final class classRoom {
	private String className;
	private int classRoomId;
	private int noOfSystems;
	private boolean projector;
	private boolean ac;
	private String faculty;
	private boolean availability;
	private static int counter;
	private String userid;
	private String pwd;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	static {
		counter=0;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		classRoom.counter = counter;
	}
	public classRoom() {
		counter++;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public int getClassRoomId() {
		return classRoomId;
	}
	public void setClassRoomId(int classRoomId) {
		this.classRoomId = classRoomId;
	}
	public int getNoOfSystems() {
		return noOfSystems;
	}
	public void setNoOfSystems(int noOfSystems) {
		this.noOfSystems = noOfSystems;
	}
	public boolean isProjector() {
		return projector;
	}
	public void setProjector(boolean projector) {
		this.projector = projector;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "classRoom [className=" + className + ", classRoomId=" + classRoomId + ", noOfSystems=" + noOfSystems
				+ ", projector=" + projector + ", ac=" + ac + ", faculty=" + faculty + ", availability=" + availability
				+ "]";
	}

	

}

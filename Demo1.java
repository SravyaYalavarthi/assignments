package com.deloitte.employee;

import java.util.Scanner;

public class Demo1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		classRoom[] arrayofRooms=null;
		while(true) {
		System.out.println("plz enter option1 to add new room"
	                       +"option2 to search the room"
				          +"option3 to dispaly all the rooms" 
	                      +"option4 to allocate the room"
				          +"option5 to exit the application");
		String option=sc.next();
		switch(option) {
		case "1":
		System.out.println("plz enter total no of rooms");
		String noOfRooms=sc.next();
		arrayofRooms=new classRoom[Integer.parseInt(noOfRooms)];
		for(int i=0;i<arrayofRooms.length;i++)
		{
		System.out.println("enter class name");
		String name=sc.next();
		System.out.println("enter class id");
		String id=sc.next();
		System.out.println("enter no of systems");
		String systems=sc.next();
		System.out.println("do you have a projector");
		String proj=sc.next();
		System.out.println("do you have ac");
		String ac=sc.next();
		//System.out.println("enter faculty name");
		//String trainename=sc.next();
		//System.out.println("availability");
		//String ava=sc.next();
		classRoom cr=new classRoom();
		cr.setClassName(name);
		cr.setClassRoomId(Integer.parseInt(id));
		cr.setNoOfSystems(Integer.parseInt(systems));
		cr.setProjector(Boolean.parseBoolean(proj));
		cr.setAc(Boolean.parseBoolean(ac));
		//cr.setFaculty(trainename);
		//cr.setAvailability(Boolean.parseBoolean(ava));
		arrayofRooms[i]=cr;
		System.out.println("counter="+cr.getCounter());
		}
		break;
		case "2":
			System.out.println("enter class id");
			String id=sc.next();
		Boolean flag=false;
			for(classRoom cr:arrayofRooms) {
				if(cr.getClassRoomId()==Integer.parseInt(id)) {
						System.out.println(cr);
				flag=true;
				}
				else if(!flag) {
					System.out.println("no rooms found");
			}
			}
			break;
		case "3":
		for(classRoom cr:arrayofRooms) {
			System.out.println(cr);
		}
		break;
		case "4":
			System.out.println("enter no of systems");
			String systems=sc.next();
			Boolean flag1=false;
			for(classRoom cr:arrayofRooms) {
				if(cr.getNoOfSystems()>=Integer.parseInt(systems)) {
						//System.out.println(cr);
				flag1=true;
				System.out.println("allocated");
				System.out.println("enter faculty name");
				String trainename=sc.next();
				cr.setFaculty(trainename);
				System.out.println("faculty allocated");
				cr.setAvailability(true);
				System.out.println(cr);
			break;
				}
				else if(!flag1) {
					System.out.println("no rooms available");
				}
			}
			break;
		case "5":
			System.exit(0);
		}
		}			
	}


}

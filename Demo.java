package com.deloitte.employee;
import java.util.*;
public class Demo {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	Map<Integer,classRoom> m=new HashMap<Integer,classRoom>();
	ArrayList<classRoom> list=new ArrayList<classRoom>();
	while(true) {
	System.out.println("plz enter option1 to add new room"
                       +"option2 to search the room"
			          +"option3 to dispaly all the rooms" 
                      +"option4 to allocate the room"
			          +"option5 to exit the application"
                      +"option6 to login");
	String option=sc.next();
	classRoomimpl mainClassRoomObj=new classRoomimpl();
	switch(option) {
	case "1":
	System.out.println("enter class name");
	String name=sc.next();
	String id="";
	while(true) {
	System.out.println("enter class id");
     id=sc.next();
	if(utility.idValidation(id)) {
		break;
	}
	else {
		continue;
	}
	}
	System.out.println("enter no of systems");
	String systems=sc.next();
	System.out.println("do you have a projector");
	String proj=sc.next();
	System.out.println("do you have ac");
	String ac=sc.next();
	//System.out.println("enter faculty name");
	//String trainename=sc.next();
	System.out.println("availability");
	String ava=sc.next();
	//cr.setFaculty(trainename);
	//cr.setAvailability(Boolean.parseBoolean(ava));
	classRoom cr=mainClassRoomObj.addRooms(name, id, systems, proj, ac,ava);
	m.put(cr.getClassRoomId(), cr);
	break;
	case "2":
		System.out.println("plz enter room id");
		String id1=sc.next();
		System.out.println(mainClassRoomObj.searchRooms(Integer.parseInt(id1),m));
		break;
	case "3":
		Set<Integer> setOfRoomKeys=m.keySet();
		for(Integer crobj:setOfRoomKeys)
			System.out.println(m.get(crobj));
		break;
	case "4":
		System.out.println("plz enter no of systems");
		String system=sc.next();
		System.out.println("plz enter no of rooms");
		String noofroomsneeded=sc.next();
		ArrayList<classRoom> availableRooms=mainClassRoomObj.availabilityOfRooms(Integer.parseInt(system),list);
		if(availableRooms.size()>=Integer.parseInt(noofroomsneeded)) {
			for(classRoom avlRoom:availableRooms) {
				for(classRoom roomFromMainList:list) {
					if(avlRoom.getClassRoomId()==roomFromMainList.getClassRoomId()) {
						System.out.println("plz enter faculty name");
					String faculty=sc.next();
					roomFromMainList.setFaculty(faculty);
					roomFromMainList.setAvailability(false);
					System.out.println(avlRoom);
					break;
				}
			}
		}
		}else
			System.out.println("no rooms available");
		break;
		case "5":
		System.exit(0);
		case "6":
			System.out.println("enter userid");
			String userId=sc.next();
			System.out.println("enter password");
			String Pwd=sc.next();
			boolean validateuserflag=mainClassRoomObj.validation(userId,Pwd);
			if(validateuserflag)
				System.out.println("valid user");
			else
				System.out.println("invalid user");
	}
	}			
}
}

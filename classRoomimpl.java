package com.deloitte.employee;
import java.util.*;
public class classRoomimpl  implements classRoomInterface{

	@Override
	public classRoom addRooms(String name,String id,String systems,String proj,String ac,String ava) {
		// TODO Auto-generated method stub
		classRoom cr=new classRoom();
		cr.setClassName(name);
		cr.setClassRoomId(Integer.parseInt(id));
		cr.setNoOfSystems(Integer.parseInt(systems));
		cr.setProjector(Boolean.parseBoolean(proj));
		cr.setAc(Boolean.parseBoolean(ac));
		cr.setAvailability(Boolean.parseBoolean(ava));
		return cr;
	
	}
	@Override
	public classRoom searchRooms(int id1,Map<Integer,classRoom> m) {
		// TODO Auto-generated method stub
		Set<Integer> setOfRoomKeys=m.keySet();
		for(Integer key:setOfRoomKeys) {
			if(key==id1)
				return m.get(key);
		}
		return null;
	}

	@Override
	public void allocateRoom(int noOfSystems) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public classRoom[] dispalyAllRooms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<classRoom> availabilityOfRooms(int system, ArrayList<classRoom> list) {
		// TODO Auto-generated method stub
	 ArrayList<classRoom> availableRooms=new ArrayList<classRoom>();
		for(classRoom cr:list) {
			if(cr.getNoOfSystems()>=system&&cr.isAvailability()) {
	  availableRooms.add(cr);
			}
		}
		return availableRooms;
	}

	@Override
	public boolean validation(String userId,String Pwd) {
		// TODO Auto-generated method stub
		if((userId.equals("admin"))&&(Pwd.equals("admin"))) {
		 return true;
		}
		 else
return false;
	}
}

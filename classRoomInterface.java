package com.deloitte.employee;
import java.util.*;
public interface classRoomInterface {
	public classRoom addRooms(String name,String id,String systems,String proj,String ac,String ava);
	public classRoom searchRooms(int id1,Map<Integer,classRoom> m);
	public ArrayList<classRoom> availabilityOfRooms(int systems,ArrayList<classRoom> list);
	public void allocateRoom(int noOfSystems);
	public classRoom[] dispalyAllRooms();
	public boolean validation(String userId,String Pwd);
}

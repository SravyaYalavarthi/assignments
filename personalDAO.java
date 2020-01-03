package com.deloitte.designationProject.dao;
import java.sql.*;
import java.util.ArrayList;
import com.deloitte.designationProject.model.personalDetails;
public class personalDAO {
		public static Connection connectToDB() {
			Connection connection=null;
			try {
				//step1 register the driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//step2 create connection
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			return connection;
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
	public static void addstudent(personalDetails pd ) {
		System.out.println(pd);
		//step3 create a statement
	try {
		Connection con=connectToDB();
		PreparedStatement stmt=con.prepareStatement("insert into personalDetails values(?,?,?,?,?,?,?,?,?)");
		stmt.setInt(1,pd.getUserID());
		stmt.setString(2, pd.getEmailId());
		stmt.setString(3, pd.getName());
		stmt.setString(4, pd.getFathersName());
		stmt.setString(5, pd.getMothersName());
		stmt.setString(6,pd.getAddress());
		stmt.setLong(7, pd.getContactno());
		stmt.setString(8,pd.getGender());
		stmt.setString(9, pd.getPassword());
		//step4 execute sql query
		int affectedRows=stmt.executeUpdate();
		System.out.println("affectedRows="+affectedRows);
		}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static ArrayList<personalDetails> displaystudents() {
		// TODO Auto-generated method stub
		ArrayList<personalDetails> list=new ArrayList<personalDetails>();
		try {
		Connection con=connectToDB();
		PreparedStatement stmt=con.prepareStatement("select * from personalDetails");
		ResultSet rs=stmt.executeQuery();  
		while(rs.next()){  
			personalDetails pd1=new personalDetails();
			pd1.setUserID(rs.getInt(1));
			pd1.setEmailId(rs.getString(2));
			pd1.setName(rs.getString(3));
			pd1.setFathersName(rs.getString(4));
			pd1.setMothersName(rs.getString(5));
			pd1.setAddress(rs.getString(6));
			pd1.setContactno(rs.getLong(7));
			pd1.setGender(rs.getString(8));
			pd1.setPassword(rs.getString(9));
			list.add(pd1);
		}
		con.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return list;

	}
	public static void login(String emailid,String password1){
		try {
		Connection con=connectToDB();
		PreparedStatement stmt=con.prepareStatement("select * from personalDetails where emailid=? and password=?");
		stmt.setString(1,emailid);
		stmt.setString(2, password1);
		ResultSet rs=stmt.executeQuery(); 
		int count=0;
		while(rs.next()){  
			count++;
		}
		if(count!=0) {
			System.out.println("login successfull");
			con.close();
		}
		else {
			System.out.println("login failed");
			con.close();
		}
		con.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}


}

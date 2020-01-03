package com.deloitte.library.dao;
import java.sql.*;
import java.util.*;

import com.deloitte.library.model.Books;
public class BooksDAO {
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
public static void addbook(Books book ) {
	System.out.println(book);
	//step3 create a statement
try {
	Connection con=connectToDB();
	PreparedStatement stmt=con.prepareStatement("insert into book values(?,?,?,?)");
	stmt.setInt(1,book.getBookid());
	stmt.setString(2, book.getBookname());
	stmt.setString(3, book.getBookauthor());
	stmt.setDouble(4, book.getBookprice());
	//step4 execute sql query
	int affectedRows=stmt.executeUpdate();
	System.out.println("affectedRows="+affectedRows);
	}catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public static ArrayList<Books> displaybook() {
	// TODO Auto-generated method stub
	ArrayList<Books> list=new ArrayList<Books>();
	try {
	Connection con=connectToDB();
	PreparedStatement stmt=con.prepareStatement("select * from book");
	ResultSet rs=stmt.executeQuery();  
	while(rs.next()){  
		Books book=new Books();
		book.setBookid(rs.getInt(1));
		book.setBookname(rs.getString(2));
		book.setBookauthor(rs.getString(3));
		book.setBookprice(rs.getDouble(4));
		list.add(book);
	}
	con.close();
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
}
public static ArrayList<Books> searchbook(String book_name){
	ArrayList<Books> list=new ArrayList<Books>();
	try {
	Connection con=connectToDB();
	PreparedStatement stmt=con.prepareStatement("select * from book where bookname=?");
	stmt.setString(1,book_name);
	ResultSet rs=stmt.executeQuery();  
	while(rs.next()){  
		Books book=new Books();
		book.setBookid(rs.getInt(1));
		book.setBookname(rs.getString(2));
		book.setBookauthor(rs.getString(3));
		book.setBookprice(rs.getDouble(4));
		list.add(book);
	}
	con.close();
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
	
}
public static void deletebook(String book_name1){
	try {
	Connection con=connectToDB();
	PreparedStatement stmt=con.prepareStatement("delete from book where bookname=?");
	stmt.setString(1,book_name1);
	int affectedRows=stmt.executeUpdate();
	System.out.println("affectedRows="+affectedRows);
	con.close();
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}

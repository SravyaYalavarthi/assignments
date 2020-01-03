package com.deloitte.library.model;

public class Books {
	private static int counter=1000;
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Books.counter = counter;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	private int bookid;
	private String bookname;
	private String bookauthor;
	private double bookprice;
	public Books() {
		counter++;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "books [bookid="+bookid+",bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookprice=" + bookprice + "]";
	}
	public String getBookname() {
		// TODO Auto-generated method stub
		return bookname;
	}



}

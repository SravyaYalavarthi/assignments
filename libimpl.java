package com.deloitte.library.services;

import java.util.ArrayList;

import com.deloitte.library.dao.BooksDAO;
import com.deloitte.library.exceptions.BookNameException;
import com.deloitte.library.model.Books;
import com.deloitte.library.utility.utilities;

public class libimpl implements libraryInterface{

	@Override
	public void addbook(String bookid,String bookname,String bookauthor, String bookprice) {
		// TODO Auto-generated method stub
		
		Books book=new Books();
		book.setBookid(Integer.parseInt(bookid));
		book.setBookname(bookname);
		book.setBookauthor(bookauthor);
		book.setBookprice(Double.parseDouble(bookprice));
		BooksDAO.addbook(book);
	}

	@Override
	public ArrayList<Books> displaybook() {
		// TODO Auto-generated method stub
		return BooksDAO.displaybook();
	}

	@Override
	public ArrayList<Books> searchbook(String book_name) {
		// TODO Auto-generated method stub
	return BooksDAO.searchbook(book_name);
	}

	@Override
	public void deletebook(String book_name1) {
		// TODO Auto-generated method stub
		BooksDAO.deletebook(book_name1);
	}

}

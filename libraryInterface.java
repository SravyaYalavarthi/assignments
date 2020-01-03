package com.deloitte.library.services;

import java.util.ArrayList;

import com.deloitte.library.model.Books;

public interface libraryInterface {
public void addbook(String bookid,String bookname,String bookauthor,String bookprice);
public ArrayList<Books> displaybook();
public ArrayList<Books> searchbook(String book_name);
public void deletebook(String book_name1);


}
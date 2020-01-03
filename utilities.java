package com.deloitte.library.utility;

import com.deloitte.library.exceptions.BookNameException;

public class utilities {
	public static void nameValidation(String bookname)throws BookNameException {
		String pattern="^[A-Za-z]+$";
		if(!bookname.matches(pattern)) {
			throw new BookNameException("name can only have alphabets");
		}
	}

}

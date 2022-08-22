package com.cg.client;

import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;

public class client {

	public static void main(String[] args) 
	{
		BookService bs=new BookServiceImpl();
		System.out.println("Total number of Books");
		System.out.println("Total Book:" +bs.getBookCount());
		
		System.out.println("Listing book by id:103");
		System.out.println("Total Book:" +bs.getBookById(103));
		
		System.out.println("Listing all books::");
		System.out.println("Total Book:" +bs.getAllBooks());
		
		
		System.out.println("Listing book written by jemas");
		System.out.println("Total books"+bs.getBookByAuthor("jamas"));
		
		System.out.println("Listing book by author::");
		System.out.println("Total book"+bs.getBookByAuthor("java"));
		
		System.out.println("Listing book between the range 200to 500");
		System.out.println("Total book"+bs.getBookByPriceRange(200, 500));
	}

}

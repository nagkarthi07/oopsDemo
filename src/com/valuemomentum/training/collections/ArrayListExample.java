package com.valuemomentum.training.collections;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Book> list=new ArrayList<Book>();
	
	Book b1=new Book(101,"dasda","sdasdsd","sdsds",8);
	Book b2=new Book(1012111,"dahhjhsda","sdasssssdsd","asttt",7);
	Book b3=new Book(101111,"dammmmsda","sdaaaasdsd","sxxxx",9);

	list.add(b1);
	list.add(b2);
	list.add(b3);
	
	for(Book b:list)
	{
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
	
	}
	
	
	
}

package com.valuemomentum.training.collections;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> al=new ArrayList<String>();
al.add("karu");
al.add("mich");
al.add("scila");

Iterator  itr=al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
	}



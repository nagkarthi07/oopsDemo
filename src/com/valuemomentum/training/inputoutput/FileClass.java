package com.valuemomentum.training.inputoutput;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File f=new File("hello.txt");
	if(f.createNewFile())
	{
		System.out.println("new file created");
	}
	else {
		System.out.println("file already exists");
	}
	}
catch(IOException e) {
	e.printStackTrace();
}
	
	}

}

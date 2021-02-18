package com.valuemomentum.training.inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=null;
try {
	FileInputStream fileIn=new FileInputStream("");
	ObjectInputStream in=new ObjectInputStream(fileIn);
	e=(Employee)in.readObject();
	in.close();
	fileIn.close();

}
catch(IOException i)
{
	i.printStackTrace();
	return;
}catch(ClassNotFoundException c)
{
	System.out.println("employee class not found");
	c.printStackTrace();
	return;
}
System.out.println("deserialized Employee");
System.out.println("name"+e.name);
System.out.println("addresss"+e.address);
System.out.println("SSN:"+e.SSN);
System.out.println("number"+e.number);
	}

}

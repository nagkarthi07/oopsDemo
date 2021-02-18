package com.valuemomentum.training.concurrency;

public class MyThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread objex=new MyThread();
objex.create();
System.out.println("main th");

	}
public void create()
{
	Thread objtx=new Thread(this);
			objtx.start();
}
public void run()
{
	while(true) {
		try
		{
			System.out.println("tisis child");
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			
		}
	}
}
}

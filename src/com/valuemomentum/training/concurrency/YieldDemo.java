package com.valuemomentum.training.concurrency;
class MyThread4 extends Thread
{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"in control");

	}
}
}
public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread4 t=new MyThread4();
t.start();
for(int i=0;i<5;i++)
{
	Thread.yield();
	System.out.println(Thread.currentThread().getName()+"in control");
}
	}

}

package com.valuemomentum.training.concurrency;

public class MyThread3 extends Thread {
	public void run() {
        System.out.println("MyThread - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread - END "+Thread.currentThread().getName());
    }
	 public MyThread3(String name) {
		    super(name);
		    }
    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}

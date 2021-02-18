package com.valuemomentum.training.concurrency;

public class HeavyWorkRunnable implements Runnable {
public void run() {
	System.out.println("doing heavy"+Thread.currentThread().getName());
	try {
		Thread.sleep(1000);
		doDBProcessing();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("doing heavy processing"+Thread.currentThread().getName());
}

private void doDBProcessing() throws InterruptedException {
	// TODO Auto-generated method stub
	Thread.sleep(500);
}
}

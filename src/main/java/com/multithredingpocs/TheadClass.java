package com.multithredingpocs;

public class TheadClass extends Thread {
	
	//creating thread with extends to Thread class
	public static void main(String[] args) {
		//creating thread object for thread
		Thread t=new Thread();
		t.start();
	}

	@Override
	public void run() {
		System.out.println("with in the run mathod");
		// TODO Auto-generated method stub
		super.run();
	}
}

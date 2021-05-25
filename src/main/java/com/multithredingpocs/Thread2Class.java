package com.multithredingpocs;

//creating thread with implemtnts to Runneble interface
public class Thread2Class implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("with in run method");
	}
	
	public static void main(String[] args) {
		
		//creating object for thread2class
		Thread2Class tc=new Thread2Class();
		Thread t=new Thread(tc);
		
        //calling run method
		t.start();
	}

}

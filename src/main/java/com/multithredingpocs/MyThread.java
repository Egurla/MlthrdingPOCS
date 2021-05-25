package com.multithredingpocs;

public class MyThread extends Thread {
	

	String msg;
	LockObj  fobj;
	public MyThread(String msg, LockObj fobj) {
		super();
		this.msg = msg;
		this.fobj = fobj;
		start();
	}
	      
	public void run()
	  {
	    fobj.display(msg);
	  }
	  
	  
	public static void main (String[] args)
	  {
		LockObj fnew = new LockObj();
		MyThread ss = new MyThread("welcome", fnew);
		MyThread ss1= new MyThread("new",fnew);
		MyThread ss2 = new MyThread("programmer", fnew);
		
		
	  }
}

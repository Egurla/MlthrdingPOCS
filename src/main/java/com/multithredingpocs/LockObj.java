package com.multithredingpocs;

public class LockObj {
	
	  synchronized public void display(String msg)
	  {
	    System.out.print ("inside the synchronize "+msg);
	    try
	    {
	      Thread.sleep(1000);
	    }
	    catch(InterruptedException e)
	    {
	      e.printStackTrace();
	    }
	    System.out.println ("");
	  
	}


}

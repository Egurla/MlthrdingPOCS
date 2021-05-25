package com.multithredingpocs;

public class MainThread implements Runnable {

	public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
	
	    public static void main(String[] args)
	    {
	    	
	    	MainThread myth=new MainThread();
	        int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	            Thread object
	                = new Thread(myth);
	            object.start();
	        
	    }
	}
}

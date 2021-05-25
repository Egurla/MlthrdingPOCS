package com.multithredingpocs;

public class MultithredDemo {

	public static void main(String args[])
    {
        Sender snd = new Sender();
        ThreadDemo S1 =
            new ThreadDemo( " Hi " , snd );
        ThreadDemo S2 =
            new ThreadDemo( " Bye " , snd );
 
        // Start two threads of ThreadedDemo
        S1.start();
        S2.start();
 
        // wait for threads to end
        try
        {
            S1.join();
            S2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
        
        System.out.println(" using yeild method");
        
        
        ThreadDemo S3 =
                new ThreadDemo( " Hi " , snd );
            ThreadDemo S4 =
                new ThreadDemo( " Bye " , snd );
            S3.start();
            S4.start();
            
        Thread.yield();
        Thread.yield();
        
    
    }
}

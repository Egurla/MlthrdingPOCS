package com.multithredingpocs;

public class ThreadDemo extends Thread {

	private String msg;
    Sender  sender;
 
    ThreadDemo(String m,  Sender obj)
    {
        msg = m;
        sender = obj;
    }
 
    public void run()
    {
        // Only one thread can send a message at a time. 
        synchronized(sender)
        {
            sender.sendData(msg);
        }
    }
}

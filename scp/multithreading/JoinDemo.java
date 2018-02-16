package com.scp.multithreading;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Hi1 h1= new Hi1();
		h1.start();
		h1.join();
		System.out.println("bye..");
		
		
	}

}
class Hi1 extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("hi..");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

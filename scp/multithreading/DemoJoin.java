package com.scp.multithreading;

public class DemoJoin
{
	public static void main(String[] args) throws InterruptedException {
		Thread t1= new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<5; i++)
				{
					System.out.println("Hi..");
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		});
		Thread t2= new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<5; i++)
				{
					System.out.println("Hello..");
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		});
		Thread t3= new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<5; i++)
				{
					System.out.println("Bye..");
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		});
		t1.start();
		//t1.join();
		t2.start();
		t1.join(1000);
		t3.start();

	}
}

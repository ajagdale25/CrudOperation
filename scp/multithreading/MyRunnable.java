package com.scp.multithreading;

public class MyRunnable {
	public static void main(String[] args) throws InterruptedException {
		HiHi h1= new HiHi();
		HelloHello h2= new HelloHello();
		Thread t1= new Thread(h1);
		Thread t2= new Thread(h2);
		t1.start();
		Thread.sleep(10);
		t2.start();
	}
}
class HiHi implements Runnable
{
	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class HelloHello implements Runnable
{
	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
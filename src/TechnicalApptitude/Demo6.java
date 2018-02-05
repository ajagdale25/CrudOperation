package TechnicalApptitude;

public class Demo6 extends Thread
{
	public static void main(String[] args)
	{
		Demo6 d = new Demo6();
		Thread t= new Thread(d);
		t.start();
	}
	public void run()
	{
		for(int i=0; i<3;i++)
		{
			System.out.print(i+"..");//0..1..2
		}
	}
}

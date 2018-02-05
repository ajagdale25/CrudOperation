package TechnicalApptitude;

public class Demo7 
{
	static int j;
	static void m1(int i)//i=0
	{
		boolean b;
		do
		{
			b= i<10 | m2(4);//i=o so condition true and it pass m2(4) i.e i=4
			b= i<10 || m2(8);// skip 

		}while(!b);
	}
	static boolean m2(int i) {
		j+=i;					//0+4=4 = j
		return true;
	}
	public static void main(String[] args) {
		m1(0);//
		System.out.println("j : "+j);// j : 4
	}
}

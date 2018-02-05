package TechnicalApptitude;

public class Demo5
{
	public static void main(String[] args) 
	{
		int i=0;//0
		outer:
			while(true)
			{
				i++;//1
				inner:
					for(int j=0; j<10; j++)//0 
					{
						i+=j;// i=1+0=1 
						if(j==3)//0==3 false
						{
							continue inner;
						}
						break outer;//break outer with i=1....
					}
				continue outer;
			}
		System.out.println("I: "+i);
	}
}

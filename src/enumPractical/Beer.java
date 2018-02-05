package enumPractical;

public enum Beer 
{
	KF, KO, RC, FO
}
class Test{
	public static void main(String[] args)
	{
		Beer b = Beer.KF;
		switch(b)
		{
		case KF:
			System.out.println("It's childrens brand...");
			break;
		case KO:
			System.out.println("It's too light...");
			break;
		case RC:
			System.out.println("It's not that much kick...");
			break;
		case FO:
			System.out.println("Buy one get one free...");
			break;
		default:
			System.out.println("Other brand is not recommended...");
		}
	}//9970012135: 
}
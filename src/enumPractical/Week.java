package enumPractical;

public enum Week 
{

	JAN(1), FEB(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
	private int id;

	public void m1() {
		System.out.println("Enum hi print");
	}
	Week(int i)
	{
		id= i;
		//System.out.println("enum constructor");// 12 time print these line...
	}
	int getId() {
		return id;
	}
}

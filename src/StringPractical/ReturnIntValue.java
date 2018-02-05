package StringPractical;

/**
 * @author Amol
 *
 */
public class ReturnIntValue {

	public static String replaceIntoNumber(String str) {
		StringBuffer sb=new StringBuffer(str);
		for(int i=0; i<sb.length(); i++)
		{
			//Range Of ASCII value for digit also from 48 to 57 these digit
			//so we can say 48 are 0  49-1...  and 57 is 9 so compare these.
			if(sb.charAt(i)<47 || sb.charAt(i)>57)
			{
				sb.deleteCharAt(i);
				i--;
			}
		}
		return sb.toString();//12345
	}
	
	public static void main(String[] args)
	{
		String s1 = "Amol123Jagdale";
		String number = s1.replaceAll("[^0-9]", ""); // returns 123
		System.out.println("First Way to print Number : "+number);
		String[] arr= number.split("");// split Number 
		for(String string:arr)
		{
			System.out.println(string);
		}
		
		
		
		System.out.println("Second Way with StringBuffer deleteCharAt() method:  ");
		String str="amol123ja45gdale";
		str=replaceIntoNumber(str);
		System.out.println("Number :"+str);
		String[] arr1= str.split("");//Split Number
		for(String string:arr1)
		{
			System.out.println(string);
		}
		int i=Integer.parseInt(str);//converting the stringNumber into int value.
		System.out.println("I "+i);// number12345
		int sum=0;
		while(i>0)
		{
			int add= i%10;
			//System.out.println("Add"+add);
			sum= sum+add;
			i=i/10;
		}
		System.out.println("Sum of number: "+sum);
		
		
	}

}

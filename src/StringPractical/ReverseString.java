package StringPractical;

/**
 * @author Amol
 *
 */
public class ReverseString {

	public static void main(String[] args) 
	{
		String s1= "Amol";
		String s2= new String("Amol/Jagdale");
		StringBuffer sb= new StringBuffer(s2);
		sb.reverse();
		System.out.println("With StringBuffer Object: "+sb);
		
		StringBuilder sb2= new StringBuilder(s1);
		sb2.reverse();
		System.out.println("With StringBuilder Object: "+sb2);
		
		System.out.println("Only with loop");
		for(int i=s2.length()-1; i>=0; i--)
		{
			System.out.print(""+s2.charAt(i));
		}
		System.out.println();
		
		System.out.println("With Array and loop");
		char[] ch=s2.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(""+s2.charAt(i));
		}
		System.out.println();
		
		System.out.println("Substring (1, 4):  "+s2.substring(1, 4));
		
		String[] str=s2.split("/");
		System.out.println("After Split");
		for (String string : str) {
			System.out.println(string);		
		}	
	}
}

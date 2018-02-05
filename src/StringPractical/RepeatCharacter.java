package StringPractical;

/**
 * @author Amol
 *
 */
public class RepeatCharacter {
	public static void main(String[] args) {
		String s= "amoljagdale";
		String s1="ajsbcbjkvbf";
		String s3= s.concat(s1);
		System.out.println(s3);
		/*s3= s3.replace('a',' ');
		System.out.println(s3);*/
	
        char ch;
        String ans=" "; 
        for(int i=0; i<s3.length(); i++)
        {
            ch = s3.charAt(i);//a m o l
            if(ch!=' ')
            {
                ans = ans + ch;//amol
                //System.out.print("Ans "+ans);//amol
            }
            //System.out.print("Ch values: "+ch);//a m o l
            s3 = s3.replace(ch,' '); //Replacing all occurrence of the current character by a space
        }
       System.out.println("Word after removing duplicate characters : " + ans);
	}
}

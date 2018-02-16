package com.scp.string;

public class ReverseNumber {
	public static void main(String[] args) {
		int number=123456;
		number=reverse(number);
		System.out.println(number);
	}

	private static int reverse(int num) {
		 int rev=0;
		 while(num!=0)
		{
			rev= rev*10;
			rev= rev + num%10;
			num= num/10;
		}
		return rev;	
	}
}

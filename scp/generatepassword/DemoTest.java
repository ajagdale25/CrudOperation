package com.scp.generatepassword;

import java.util.Random;

public class DemoTest {
	public static void main(String[] args) {
		String[] string= {"A","B","C","D","E","F","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
				"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		System.out.println("Your new Password is: ");
		for(int i=0; i<7; i++)
		{
			System.out.print(string[new Random().nextInt(string.length)] );
		}
		int num = 0;
		Random r= new Random();
		for(int counter= 0; counter<2; counter++)
		{
			num= r.nextInt(9);
			System.out.print(num);
		}
		String[] symbol= {"@","&",".","/","$","*","-","_"};
		System.out.print(symbol[new Random().nextInt(symbol.length)]);
	}

}

package com.scp.generatepassword;


public class GeneratePassword {

	public static void main(String[] args) {
		String result= makePassword(8);
		System.out.println("Your new Temporary password is : "+result);
	}

	public static String makePassword(int length) {
		String password="";
		
		for(int i=0; i<6; i++)
		{
			password= password + randomChracter("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
		}
		String randomDigit = randomChracter("0123456789");
		password = insertAtRandom(password, randomDigit);
		String randomSymbol = randomChracter("@._$");
		password = insertAtRandom(password, randomSymbol);
		return password;
	}

	public  static String insertAtRandom(String str, String toInsert) {
		int n = str.length();
		int r = (int) ((n+1) * Math.random());
		return str.substring(0, r)+ toInsert + str.substring(r);
	}

	public static String randomChracter(String characters) {
		int n= characters.length();
		int r= (int) (n*Math.random());
		return characters.substring(r, r+1);
		
	}

}

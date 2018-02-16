package com.scp.generatepassword;

import java.util.Random;

public class RandomPassword {
	public static void main(String[] args)
	{
		System.out.println(generatePassword(8));
	}
	static char[] generatePassword(int len)
	{
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "@#$&*_-.";
		String values = upperCase + lowerCase + numbers + symbols;
		
		Random random = new Random();
		char[] password = new char[len];
		for (int i = 0; i < len; i++)
		{
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
}

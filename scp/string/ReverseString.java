package com.scp.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args)
	{
		String str= "12";
		System.out.println("Original String : "+str);
		str = reverse(str);
		System.out.println("Reverse String  : "+str);
	}

	public static String reverse(String str) 
	{
		if(str==null || str.equals(""))//.....................3
			return str;
		
		/*if(str==null || str.equals(""))//.....................3
			return str;
		
		String rev="";
		for(int i=str.length()-1; i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		return rev;*/
	/*	List<Character> list= new ArrayList<>();//......................2
		for(char c: str.toCharArray())
		{
			list.add(c);
		}
		Collections.reverse(list);
		StringBuilder builder= new StringBuilder(list.size());
		for(Character ch: list)
		{
			builder.append(ch);
		}
		return builder.toString();*/
		return new StringBuilder(str).reverse().toString();//..............1
	}



}

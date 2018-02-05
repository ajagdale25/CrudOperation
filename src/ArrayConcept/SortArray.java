package ArrayConcept;

import java.util.Arrays;

public class SortArray {
/*
 * With Array sort method it can easily sort the Array.
 */
	public static void main(String[] args) 
	{
		String[] name= {"Amol", "Sayali", "Amruta","Lakshmi", "Vinay"};
		System.out.println("Before Sort Array");
		for(int i=0;i<name.length; i++)
		{
			System.out.println(i+" :"+name[i]);
		}
		System.out.println();
		System.out.println("After Sort Array");
		for(int i=0;i<name.length; i++)
		{
			Arrays.sort(name);
			System.out.println(i+" :"+name[i]);
		}
	}

}

package ArrayConcept;

import java.util.Arrays;

import javax.naming.ldap.SortControl;

public class LargeNumber {

	public static void main(String[] args)
	{
		double[] arr= {10, 5, 50, 70, 25, 15};
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		double total = 0;
		for(int i=0; i<arr.length;i++)
		{
			total= total+arr[i];
		}
		System.out.println("Total of Array: "+total);
		double large=arr[0];//10 20 50
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			large=arr[i];
		}
		System.out.println("Large Number: "+large);
		double small=arr[0];//10 20 50

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
			small=arr[i];
		}
		System.out.println("smallest Number: "+small);
		Arrays.sort(arr);
		//Arrays.sort() method which is used to sort the Array.
		System.out.println(Arrays.toString(arr));
	}

}

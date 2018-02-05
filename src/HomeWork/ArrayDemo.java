package HomeWork;

import java.util.Arrays;

/**
 * @author Amol
 *
 */
public class ArrayDemo {
	
	//toString method is used to returns the string representation list of arrays elements
	//enclosed in square brackets
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=i*2;
			System.out.print(" "+arr[i]);// 0 1 2 3 4


		}
		System.out.println();
		//it will print the address of that particular object.
		//so you can use Array.toString for iterate that object value.
		//System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4]
		//[0,1,2,3,4]
		
		int[] arr1= {10, 20, 30, 40, 50};
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(" "+arr1[i]);//10, 20, 30, 40, 50
		}
		System.out.println();
		System.out.println(Arrays.toString(arr1));//[10, 20, 30, 40, 50]
		arr1[4]=9;
		System.out.println(Arrays.toString(arr1));//[10, 20, 30, 40, 50]

		
	}

}

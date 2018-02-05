package ArrayConcept;

public class SortArrayWithout {

	public static void main(String[] args) {
		int x[] = { 10, 30, 15, 69, 52, 89, 5 };
	    int max;
	    int temp = 0;
	    int index = 0;
	    for (int i = 0; i < x.length; i++) {
	        int counter = 0;//  1
	        max = x[i];//10 
	        for (int j = i + 1; j < x.length; j++) {

	            if (x[j] > max) {//(30>10)(15
	                max = x[j];//30
	                index = j;//1
	                counter++;
	            }

	        }
	        if (counter > 0) {
	            temp = x[index];
	            x[index] = x[i];
	            x[i] = temp;
	        }
	    }
	    for (int i = 0; i < x.length; i++) {
	        System.out.println(x[i]);
	    }


	}

}

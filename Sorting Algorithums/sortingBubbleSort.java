import java.util.*;

public class sortingBubbleSort {
    public static void printArray(int array[]) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
	public static void main(String args[]) {
		int array[] = {7, 8, 3, 1, 2};
		
		// Bobble sort 
		for (int i=0; i<array.length-1; i++) { // n-1 
		    for (int j=0; j<array.length-i-1; j++) { 
		        if (array[j] > array[j+1]) {
		            // Swap
		            int temp = array[j];
		            array[j] = array[j+1];
		            array[j+1] = temp;
		        }
		    }
		}
		printArray(array);
	}
}


// Time complexity = O(n^2)

/* 

1  2    3    4    5   ....... n
n, n-1, n-2, n-3, n-4,...... n-n-1

*/

// Space complexity = O(1)


/*

{7, 8, 3, 1, 2}

// Output

1 2 3 7 8 

*/

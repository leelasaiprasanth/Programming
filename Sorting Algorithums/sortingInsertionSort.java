import java.util.*;

public class sortingInsertionSort {
    public static void printArray(int array[]) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
	public static void main(String args[]) {
		int array[] = {7, 8, 3, 1, 2};
		
		// Insertion Sort 
		for (int i=0; i<array.length; i++) {
		    int current = array[i];
		    int j = i-1;
		    while (j >= 0 && current < array[j]) {
		        array[j+1] = array[j];
		        j--;
		    }
		    
		    // Placement 
		    array[j+1] = current;
		}
		
		printArray(array);
	}
}


// Time complexity = O(n^2)

/* 

1  2    3    4    5   ....... n
n-1, n-2, n-3, n-4 ........... -> AP series Common diffrence - 1 sum = n(n-1)/2 = n^2

*/

// Space complexity = O(1)


/*

{7, 8, 3, 1, 2}

// Output

1 2 3 7 8 

*/

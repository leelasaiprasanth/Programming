import java.util.*;

public class sortingSelectionSort {
    public static void printArray(int array[]) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
	public static void main(String args[]) {
		int array[] = {7, 8, 3, 1, 2};
		
		// Selection sort 
		for (int i=0; i<array.length-1; i++) { // n times
		    int smallest = i;
		    for (int j=i+1; j<array.length; j++) { // n times
		        if (array[smallest] > array[j]) {
		            smallest = j;
		        }
		    }
		    int temp = array[smallest];
		    array[smallest] = array[i];
		    array[i] = temp;
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

// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//       {3, 4, 6, 2} is not sorted in ascending order.


import java.util.*;

public class arryasIsAscending {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        // input
        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        boolean isAscending = true;
        
        // validation
        for (int i=0; i<numbers.length-1; i++) {
            if (numbers[i] > numbers[i+1]) {
                isAscending = false;
            }
        }
        
        if (isAscending) {
            System.out.println("The Array is sorted in asceding Order");
        } else {
            System.out.println("The Array is not sorted in ascending order");
        }
	}
}


// Linear Search Technique
// searching one by one value in the array



/* 


// Output 

4
1 2 4 7 
The Array is sorted in asceding Order


*/

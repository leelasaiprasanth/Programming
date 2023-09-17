// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class functionSumOfOdd {
    //New Function 
    public static void sumOfODD (int n) {
        //initialize Sum 
        int sum = 0;
        for (int i=0; i<=n; i++) {
            if ((i%2) == 1) {
            sum = sum + i;
            }
        }
        System.out.print(sum);
    }
    
    //Main Function 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 		int a = sc.nextInt();
// 		int b = sc.nextInt();
// 		int c = sc.nextInt();
		int n = sc.nextInt();
		
		//Calling function 
		sumOfODD(n);
		
	}
}


/*

// Output

10
10
10
15

*/
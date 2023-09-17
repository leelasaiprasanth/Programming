// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// (BONUS)


// 0 1 1 2 3 5 8 13 21 ..... 

import java.util.*;

public class functionFibonacciSeries {
    //New Function -> without recurssion
    // public static void fibonacci (int n) {
    //     // f(n) = F(n-1) + f(n-2)
    //     int n1 = 0, n2 = 1, count = n; 
    //     System.out.print(n1 + " " + n2);
    //     for (int i=2; i<=count; i++){
    //         n = n1 + n2;
    //         System.out.print(" " + n);
    //         n1 = n2;
    //         n2 = n;
    //     }
    // }
    
    
    // New Function -> with recurssion
    public static void fibonacci (int count, int n) {
        if (count > 0) {
            n = n1 + n2;
            n1 = n2;
            n2 = n;
            System.out.print(" " + n);
            fibonacci(count - 1);
        }
    }
    
    //Main Function 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
// 		int b = sc.nextInt();
		
		//Calling function 
		int count = n;
		int n1 = 0, n2 = 1;
		System.out.print(n1 + " " + n2);
		fibonacci(count -2, n);
	}
}


/*

10
0 1 1 2 3 5 8 13 21 34 55


*/
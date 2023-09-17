// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class functionAverageOfThree {
    //New Function 
    public static void numbersAverage (int a, int b, int c) {
        
        int average;
        average = (a + b + c)/2;
        System.out.print(average);
        
    }
    
    //Main Function 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//Calling function 
		numbersAverage(a, b, c);
		
	}
}


/*

// Output

10
10
10
15

*/
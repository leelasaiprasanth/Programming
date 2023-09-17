// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class functionGreatestOfTwo {
    //New Function 
    public static void greatest (int a, int b) {
        //Checking 
        if (a > b) {
            System.out.print(a + "is greater");
        } else {
            System.out.print(b + " is greater");
        }
    }
    
    //Main Function 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
// 		int c = sc.nextInt();
		
		
		//Calling function 
		greatest(a, b);
		
	}
}


/*

// Output

10
10
10
15

*/
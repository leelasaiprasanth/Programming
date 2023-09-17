// Write a function that takes in the radius as input and returns the circumference of a circle.

// Formula 
// r=d/2
// A=πr2
// C=2πr


import java.util.*;

public class functionCircumferenceOfCircle {
    //New Function 
    public static double CircumferenceOfCircle (double r) {
        //Checking 
        double c = 0;
        c = 2 * (3.141592 * r);
        System.out.print(c);
        return c;
    }
    
    //Main Function 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 		int a = sc.nextInt();
// 		int b = sc.nextInt();
		double r = sc.nextFloat();
		
		
		//Calling function 
		CircumferenceOfCircle(r);
		
	}
}


/*

// Output

2
12.566368

*/
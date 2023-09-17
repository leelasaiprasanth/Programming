// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)


import java.util.*;

public class functionGreatestCommonDivisor {
    //New Function -> recurssion
    public static int GCD (int a, int b) {
        if (b == 0){
            return a;
        } else {
            return GCD(b, a%b);
        }
    }
    
    
    //Main Function 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//Calling function 
		
		System.out.print(GCD(a, b));
	}
}


/*

30
20
10


*/
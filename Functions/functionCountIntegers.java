// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.*;

public class functionCountIntegers {
    //New Function 
    public static void Count () {
        Scanner sc = new Scanner(System.in);
        int n, positive, negative, zeros = 0;
        char c;
        do {
            System.out.println("Enter the Number");
            
            if ( n > 0) {
                positive++;
            }
            else if (n < 0) {
                negative++;
            }
            else {
                zeros++;
            }
            
            System.out.println("Do you want to continue ?");
            char c = sc.next().charAt(0);
        } while (c == 'Y' || c == 'y');
    }
    
    //Main Function 
	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int a = sc.nextInt();
// 		int b = sc.nextInt();
// 		int n = sc.nextInt();
		
		
		//Calling function 
		Count();
		System.out.println("Positive numbers: " + Positive);
        System.out.println("Negative numbers: " + Negative);
        System.out.println("Zero numbers: " + Zero);
    }  
	}
}


/*



*/
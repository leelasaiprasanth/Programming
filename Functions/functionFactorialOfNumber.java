import java.util.*;

public class functionFactorialOfNumber {
    // New fucntion
    public static void printFactorial (int n) {
        //loops 
        if (n < 0) {
            System.out.println("invalid Number");
            return;
        }
        int factorial = 1;
        for (int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    
    //Main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//calling function 
		printFactorial(n);
	}
}


/*

//Input / Output

-5
invalid Number
-------------------
10
3628800

*/
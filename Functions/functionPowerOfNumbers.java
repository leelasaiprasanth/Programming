// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

// X power n
import java.util.*;

public class functionPowerOfNumbers {
    //New Function 
    public static int power (int n, int x) {
        int pow = 1;
        
        for (int i=1; i<=n; i++) {
            pow = pow * x;
        }
        return pow;
    }
    
    //Main Function 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		//Calling function 
		int pow = power(n, x);
		System.out.print(pow);
	}
}


/*
3
3
27

4
2
16


*/
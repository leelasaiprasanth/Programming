import java.util.*;

public class functionPrimeOrNot {
    
    //new function 
    public static void primeNumber(int n) {
        if (n <= 1) {
            System.out.println("Invalid");
        }
        
        for (int i=2; i<=n/2; i++) {
            if ((n % i) == 0) {
                System.out.println("primeNumber");
            }
        }
        
    }
    
    //Main function 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    //Calling function 
	    primeNumber(n);
	    
	}
}

/*

//Output 

10
primeNumber
primeNumber


*/
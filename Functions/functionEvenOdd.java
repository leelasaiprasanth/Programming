import java.util.*;

public class functionEvenOdd {
    
    //new function 
    public static void evenOdd(int n) {
        if ((n%2) == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    
    //Main function 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    //Calling function 
	    evenOdd(n);
	    
	}
}

/*

//Output 

2345
Odd
-------------
1431
Odd


*/
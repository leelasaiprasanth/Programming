import java.util.*;

public class patternNumberPyramid
{
	public static void main(String[] args) {
	    int n = 5;
	    
	    //Outer Loop 
	    for (int i=1; i<=n; i++) {
	        //spaces 
	        for (int j=1; j<=n-i; j++) {
	            System.out.print(" ");
	        }
	        //numbers -> print row number times
	        for (int j=1; j<=i; j++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	    
	}
}


/*
Output

    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5


*/
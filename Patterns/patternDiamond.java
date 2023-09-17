import java.util.*;

public class patternDiamond
{
	public static void main(String[] args) {
	    int n = 4;
	    
	    //Outer Loop
	    for (int i=1; i<=n; i++) {
	        //spcaes 
	        for (int j=1; j<=n-i; j++) {
	            System.out.print(" ");
	        }
	        
	        //stars 
	        for (int j=1; j<=2*i-1; j++) {
	            System.out.print("*");
	        }
	        
	        System.out.println();
	    }
	    //Lower half 
	    for (int i=n; i>=1; i--) {
	        //spcaes 
	        for (int j=1; j<=n-i; j++) {
	            System.out.print(" ");
	        }
	        
	        //stars 
	        for (int j=1; j<=2*i-1; j++) {
	            System.out.print("*");
	        }
	        
	        System.out.println();
	    }
	    
	}
}


/*
Output

   *
  ***
 *****
*******
*******
 *****
  ***
   *

*/
import java.util.*;

public class patternSolidRhombus
{
	public static void main(String[] args) {
	    int n = 5;
	    
	    //Outer Loop 
	    for (int i=1; i<=n; i++) {
	        //Spces 
	        for (int j=1; j<=n-i; j++) {
	            System.out.print(" ");
	        }
	        
	        //Starts
	        for (int j=1; j<=n; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	}
}


/*
Output

    *****
   *****
  *****
 *****
*****


*/
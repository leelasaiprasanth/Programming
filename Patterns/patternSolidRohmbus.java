import java.util.*;

public class patternSolidRohmbus {
	public static void main(String[] args) {
		int n = 5;
// 		int num = 1;
		
		//outer loop 
		for (int i=1; i<=n; i++) {
		    //innner loop -> spaces
		    for (int j=1; j<=n-i; j++) {
		        System.out.print(" ");
		    }
		    //inner loop -> Starts
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
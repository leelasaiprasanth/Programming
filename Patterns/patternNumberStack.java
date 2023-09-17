import java.util.*;

public class patternNumberStack {
	public static void main(String[] args) {
		int n = 5;
// 		int num = 1;
		
		//outer loop 
		for (int i=1; i<=n; i++) {
		    //innner loop -> spaces
		    for (int k=i-1; k<=n; k++) {
		        System.out.print(" ");
		    }
		    //inner loop -> primary
		    for (int j=1; j<=i; j++) {
		        System.out.print(j+" ");
		    }
		    //inner loop -> rever 
		    for (int k=i-1; k>=i; k--) {
		        System.out.print(k+" ");
		    }
		    System.out.println();
		}
	}
}

/*
Output

      1 
     1 2 
    1 2 3 
   1 2 3 4 
  1 2 3 4 5

*/
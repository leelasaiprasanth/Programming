import java.util.*;

public class patterNumberPyramid {
	public static void main(String[] args) {
		int n = 5;
// 		int m = 5;
		
		//outer loop
		for (int i=1; i<=n; i++) {
		    //innner loop 
		    for (int j=1; j<=i; j++) {
		        System.out.print(j+" ");
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
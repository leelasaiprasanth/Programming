import java.util.*;

public class patternNumberPyramid {
	public static void main(String[] args) {
		int n = 5;
// 		int num = 1;
		
		//outer loop 
		for (int i=1; i<=n; i++) {
		    //innner loop 
		    for (int j=1; j<=i; j++) {
		        System.out.print(i);
		    }
		    System.out.println();
		}
	}
}

/*
Output

1
22
333
4444
55555

*/
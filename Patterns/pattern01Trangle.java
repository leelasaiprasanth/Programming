import java.util.*;

public class pattern01Trangle {
	public static void main(String[] args) {
		int n = 5;
// 		int num = 1;
		
		//outer loop 
		for (int i=1; i<+5; i++) {
		    //innner loop 
		    for (int j=1; j<=i; j++) {
		        int sum = i+j;
		        if (sum % 2 == 0) { //odd
		            System.out.print("1 ");
		        } else { //even
		            System.out.print("0 ");
		        }
		    }
		    System.out.println();
		}
	}
}

/*
Output

1 
0 1 
1 0 1 
0 1 0 1

*/
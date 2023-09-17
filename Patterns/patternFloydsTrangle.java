import java.util.*;

public class patternFloydsTrangle {
	public static void main(String[] args) {
		int n = 5;
		int num = 1;
		
		//outer loop 
		for (int i=1; i<=n; i++) {
		    //inner loop 
		    for (int j=1; j<=i; j++) {
		        System.out.print(num + " ");
		        num++;
		    }
		    System.out.println();
		}
	}
}

/*
Output

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

*/
// For a given matrix of N x M, print its transpose.

import java.util.*;

public class arraysTranspose
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int m = sc.nextInt ();

    int matrix[][] = new int[n][m];

    // Input
    // rows 
    for (int i = 0; i < n; i++) {
	    // columns
    	for (int j = 0; j < m; j++) {
    	    matrix[i][j] = sc.nextInt ();
    	  }
      }
      
      // Transpose 
      for (int j=0; j<m; j++) {
          for (int i=0; i<n; i++) {
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }
   }
}



/*

// Output 

3 2
1 2 3
3 2 1
1 3 2 
2 3 1

*/

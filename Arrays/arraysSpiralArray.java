// Print the spiral order matrix as output for a given matrix of numbers. 


// APPROACH : 
// Algorithm: (We are given a 2D matrix of n X m ).
// 1. We will need 4 variables:
// a. row_start - initialized with 0.
// b. row_end - initialized with n-1.
// c. column_start - initialized with 0.
// d. column_end - initialized with m-1.
// 2. First of all, we will traverse in the row row_start from column_start
// to column_end and we will increase the row_start with 1 as we have
// traversed the starting row.
// 3. Then we will traverse in the column column_end from row_start to
// row_end and decrease the column_end by 1.
// 4. Then we will traverse in the row row_end from column_end to
// column_start and decrease the row_end by 1.
// 5. Then we will traverse in the column column_start from row_end to
// row_start and increase the column_start by 1.
// 6. We will do the above steps from 2 to 5 until row_start <= row_end
// and column_start <= column_end.

import java.util.*;

public class arraysSpiralArray
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int m = sc.nextInt ();

    int matrix[][] = new int[n][m];

    // Input
    // rows 
    for (int i = 0; i < n; i++)
      {
	// columns
	for (int j = 0; j < m; j++)
	  {
	    matrix[i][j] = sc.nextInt ();
	  }
      }

    System.out.println ("The Spiral Order Matrix is : ");

    int rowStart = 0;
    int rowEnd = n - 1;
    int colStart = 0;
    int colEnd = m - 1;
    
    //To print spiral order matrix
      while(rowStart <= rowEnd && colStart <= colEnd) {
          //1
          for(int col=colStart; col<=colEnd; col++) {
              System.out.print(matrix[rowStart][col] + " ");
          }
          rowStart++;


          //2
          for(int row=rowStart; row<=rowEnd; row++) {
              System.out.print(matrix[row][colEnd] +" ");
          }
          colEnd--;


          //3
          for(int col=colEnd; col>=colStart; col--) {
              System.out.print(matrix[rowEnd][col] + " ");
          }
          rowEnd--;


          //4
          for(int row=rowEnd; row>=rowStart; row--) {
              System.out.print(matrix[row][colStart] + " ");
          }
          colStart++;


          System.out.println();
      }
   }
}



/*


 --------------------
|0 1 2 3 4 ..... n-1 |
|1 2 3 4 5 ....      |
|m-1 3 4 5 6 ....    |
 --------------------

6 5
1 5 7 9 10 11
6 10 12 13 20 21
9 25 29 30 32 41
15 55 59 63 68 70
40 70 79 81 95 105


// Output 

3 3
3 2 1
2 3 2
1 2 3
The Spiral Order Matrix is : 
3 2 1 2 3 2 1 2 
3


*/

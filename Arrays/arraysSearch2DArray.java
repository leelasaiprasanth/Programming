import java.util.*; 

public class arraysSearch2DArray {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int row = sc.nextInt();
		int cols = sc.nextInt();
		
		int numbers[][] = new int[row][cols];
		
		// Input
		// rows 
		for (int i=0; i<row; i++) {
		    // columns
		    for (int j=0; j<cols; j++) {
		        numbers[i][j] = sc.nextInt();
		    }
		}
		
		int x = sc.nextInt();
		
		// Checking the array 
		for (int i=0; i<row; i++) {
		    //innerloop
		    for (int j=0; j<cols; j++) {
		        // comparing the items with the x
		        if (numbers[i][j] == x) {
		            System.out.println("Value X is found at the location (" + i + "," + j + ")");
		        }
		    }
		}
	}
}


/*


// Output 

2 3
1 2 3 
4 3 1 
4
 Value X is found at the location (1,0)


*/


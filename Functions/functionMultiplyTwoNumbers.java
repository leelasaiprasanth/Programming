import java.util.*;

public class functionMultiplyTwoNumbers {
    
    // public static int calculateSum(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }
    
    //calcluate product
    public static int calcluateProduct (int a, int b) {
        return a * b;
    }
    
    //Main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//calling fucntion
        // int sum = calculateSum(a, b);
		System.out.println("Product  of Two Numers is: " + calcluateProduct(a, b));
	}
}


/*

//Input / Output

2
3
Product  of Two Numers is: 6

*/
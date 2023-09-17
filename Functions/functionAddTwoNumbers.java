import java.util.*;

public class functionAddTwoNumbers {
    
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    //Main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//calling fucntion
		int sum = calculateSum(a, b);
		System.out.println("Sum of Two Numers is: " + sum);
	}
}


/*

//Input / Output

2
3
Sum of Two Numers is: 5

*/
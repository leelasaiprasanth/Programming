// Qs: find the maximum and minimum numbers in an array of integers.


import java.util.*;

public class arryasMinMax
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        // input
        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // MIN and MAX values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        
        //output
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
	}
}


// Linear Search Technique
// searching one by one value in the array



/* 


// Output 

3
3
1 2 3 
Largest number is : 3
Smallest number is : 1


*/

// Qs: Take an array as input from the user. Search for a given number x and print the index at which it occurs.


import java.util.*;

public class arryasSearch
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        
        // input
        for (int i=0; i<size; i++) {
            number[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        
        //output
        for (int i=0; i<number.length; i++) {
            if (number[i] == x){
                System.out.println("x found index : " + i);
            }
        }
        
	}
}


// Linear Search Technique
// searching one by one value in the array



/* 


// Output 

3
1
2
3
3
x found index : 2


*/

// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.


// Formula 
// age > 18 is eligible to vote.



import java.util.*;

public class functionEligibleToVote {
    //New Function 
    public static void ageChecking (int n) {
        //Checking 
        if (n > 18) {
            System.out.print("Eligible To Vote");
        } else {
            System.out.print("Not eligible to vote");
        }
    }
    
    //Main Function 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 		int a = sc.nextInt();
// 		int b = sc.nextInt();
		int n = sc.nextInt();
		
		
		//Calling function 
		ageChecking(n);
		
	}
}


/*

// Output

18
Not eligible to vote

23
Eligible To Vote

11
Not eligible to vote

*/
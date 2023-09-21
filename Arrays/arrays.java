import java.util.*;

public class arrays
{
	public static void main(String[] args) {
// 		int marks[] = new int[3];
		// int[] marks = new int[3];
// 		marks[0] = 97; //phy
// 		marks[1] = 98; // Chem
// 		marks[2] = 95; // Eng 
// 		System.out.println(marks[0]);
// 		System.out.println(marks[1]);
// 		System.out.println(marks[2]);
        
        // int marks[] = {97, 98, 95};
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // automatic initialization of null values
        int numbers[] = new int[size];
        
        // Input
        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Output
        for (int i=0; i<size; i++) {
            System.out.print(numbers[i] + " ");
        }
	}
}

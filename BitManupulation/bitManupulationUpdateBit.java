import java.util.*;

// For 0 : Clear For 1 : Set
public class bitManupulationUpdateBit
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int oper = sc.nextInt();
		 
		 int n = 5; // 0101
		 int pos = 1;
		 //update bit to 1 else update to 0 
		 
		 int bitMask = 1 << pos;
		 if (oper == 1) {
		     // Set 
		     int newNumber = bitMask | n;
		     System.out.println(newNumber);
		 } else {
		     // Clear 
		     int newBitMask = ~(bitMask);
		     int newNumber = newBitMask & n;
		     System.out.println(newNumber);
		 }
		 
	}
}

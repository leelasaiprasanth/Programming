import java.util.*;

// AND with NOT
public class bitManupulationClearBit
{
	public static void main(String[] args) {
		 int n = 5; // 0101
		 int pos = 2;
		 int bitMask = 1 << pos;
		 int notBitMask = ~(bitMask);
		 
		 int newNumber = notBitMask & n;
		 System.out.println(newNumber);
	}
}

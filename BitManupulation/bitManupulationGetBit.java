import java.util.*;

public class bitManupulationGetBit
{
	public static void main(String[] args) {
		 int n = 5; // 0101
		 int pos = 2;
		 int bitMask = 1 << pos;
		 
		 if ((bitMask & n) == 0) {
		     System.out.println("bit is Zero");
		 } else {
		     System.out.println("bit is one");
		 }
	}
}

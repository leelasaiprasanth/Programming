import java.util.*;

// Strings are Immutable

public class stringsBuilder
{
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("RadhaeKrishna");
        System.out.println(sb);
        // Char at index 0
        System.out.println(sb.charAt(0));
        
        //set char at index 0
        sb.setCharAt(0, 'r');
        System.out.println(sb);
        
        // insert at index 0
        sb.insert(0, 'R');
        System.out.println(sb);
        
        // delete the extra
        sb.delete(1, 2);
        System.out.println(sb);
        
        // appending at nth place 
        sb.append(".");
        System.out.println(sb + " " + sb.length());
        
        // reversing the StringBuilder
        for (int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
	}
}


/*

// Output

RadhaeKrishna
R
radhaeKrishna
RradhaeKrishna
RadhaeKrishna
RadhaeKrishna. 14
.anhsirKeahdaR

*/
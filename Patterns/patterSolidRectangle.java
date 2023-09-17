import java.util.*;

public class patterSolidRectangle
{
	public static void main(String[] args) {
		
		int n = 4;
		int m = 5;
		
		//outer loop
		for (int i=1; i<=n; i++) {
		    //innner loop
		    for (int j=1; j<=n; j++) {
		        System.out.print("*");
		    }
		    System.out.println("*");
		}
		
	}
}

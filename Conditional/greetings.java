import java.util.*;

public class greetings
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		
		if (button == 1) {
		    System.out.println("hello");
		} else if (button == 2) {
		    System.out.println("Namaste");
		} else if (button == 3) {
		    System.out.println("nanjore");
		} else {
		    System.out.println("Invalid");
		}
	}
}



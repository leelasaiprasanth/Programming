import java.util.*;

public class functionPrintName {
    
    public static void printMyName (String name) {
        System.out.println(name);
        return;
    }
    
    //Main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		//calling fucntion
		printMyName(name); 
	}
}


/*

//Input 
RadhaeKrishna

//Output

RadhaeKrishna

*/
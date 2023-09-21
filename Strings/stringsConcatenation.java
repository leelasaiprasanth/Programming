import java.util.*;

// Strings are Immutable

public class stringsConcatenation
{
	public static void main(String[] args) {
// 		Scanner sc = new Scanner(system.in);
		
// 		String name = sc.nextLine();
// 		System.out.println("Your name is : " + name);
        String firstName = "Radhae";
        String secondName = "Krishna";
        String fullname = firstName + secondName;
        
        if (new String("Radhae") == new String("Krishna")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("stings are not equal");
        }
        
        String sentence = "My Gode is RadhaeKrishna";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
        
        if (firstName.compareTo(secondName) == 0){
            System.out.println("String are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        
        for (int i=0; i<fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
	}
}


/*

// Output

stings are not equal
RadhaeKrishna
Strings are not equal
R
a
d
h
a
e
K
r
i
s
h
n
a

*/
import java.util.*;

public class calculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operator : +,-,*,/");
        char cal = sc.next().charAt(0);
        System.out.println("enter Valures to caculate:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        switch (cal) {
            
            case '+' : System.out.println(a + b);break;
            case '-' : System.out.println(a - b);break;
            case '*' : System.out.println(a * b);break;
            case '/' : System.out.println(a / b);break;
            default : System.out.println("Enter correct operator !");
        }
    }
}
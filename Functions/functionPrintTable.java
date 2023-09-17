import java.util.*;

public class functionPrintTable {
    
    //new function 
    public static void tableNumber(int n) {
        //Looping 
        for (int i=1; i<=12; i++) {
            System.out.println(n + "*"+ i + "=" + n*i);
        }
    }
    
    //Main function 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    //Calling function 
	    tableNumber(n);
	    
	}
}

/*

//Output 

2
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
2*10=20
2*11=22
2*12=24


*/
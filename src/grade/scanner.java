package grade;

import java.io.InputStream;
import java.util.Scanner;

public class scanner {
    public scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		
		// 1. create an object of scanner and other variables you need
		Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String operator = "";
        int result = 0;
        
        // 2. print the lines you want to show in console
        System.out.println("Please provide two integers: ");
        // 3. wait for the value you expect, take and store that value
        a = sc.nextInt();
        b = sc.nextInt();
        
     // 4. ask the user to choose the operator
        System.out.println("Please choose the operator: (+ - / * %)");
        
     //  5. expect and catch the operator as String
        operator = sc.next();
        
     // 6. go through the selection to find which operator was selected
        if (operator.equals("+")) {
            result = a + b;
        } else if (operator.equals("-")) {
            result = a - b;
        } else if (operator.equals("/")) {
            result = a / b;
        } else if (operator.equals("*")) {
            result = a * b;
        } else if (operator.equals("%")) {
            result = a % b;
        }
        
     // 7. print the result
        System.out.println(a + operator + b + " = " + result);
	}

	public String next() {
		// TODO Auto-generated method stub
		return null;
	}

	public int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
}
        
        
        
        
        
        



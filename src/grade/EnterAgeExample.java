package grade;

import java.util.Scanner;

public class EnterAgeExample {



	public static void main(String[] args) {
		// TODO Auto-generated method
		
		// input age from user. and check if the age is greater than 21 and less than 65 
        // otherwise do something. 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        scanner.close();
        if (age > 21 && age < 65 ) {
            System.out.println("Your Eligible for drinking");
        }else  {
            System.out.println("Don't drink ");
        } 
        
        
        }
	

}
	





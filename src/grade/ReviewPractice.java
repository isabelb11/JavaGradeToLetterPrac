package grade;

import java.util.Scanner;

public class ReviewPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of the day Int value only");
        int day = scanner.nextInt();
        scanner.close();
        switch (day) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Friday Yay");
            break;
        case 7:
            System.out.println("Saturday");
            break;
        default:
            System.out.println("Wrong input");
            break;
        }

        
        
	}

}

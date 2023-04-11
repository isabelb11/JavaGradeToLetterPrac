package grade;

import java.util.Scanner;

public class ActivitySeason {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Want is the month of the year numbers only");
        int month = scanner.nextInt();
        if (month <= 0 || month > 12 ) {
            System.out.println("Wrong Input");
        }else {
            if (month == 12 || month == 1 || month == 2) {
                System.out.println("Winter");
            }else if (month == 3 || month == 4 || month == 5) {
                System.out.println("Spring");
            } else if (month == 6 || month == 7 || month == 8) {
                System.out.println("Summer");
            }else {
                System.out.println("Fall");	
            }

}
}
}

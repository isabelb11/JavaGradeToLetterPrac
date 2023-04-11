package grade;
import java.util.Scanner;

public class ReviewScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    String text = scanner.next();
    int age = scanner.nextInt();
    double price = scanner.nextDouble();
    System.out.println("Text is" + text);
    System.out.println("Age is " + age );
    System.out.println("price is " + price);
   
    scanner.close();
    
	}

}

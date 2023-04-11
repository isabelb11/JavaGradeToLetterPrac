package grade;

public class PracticeNumberScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scanner scanner = new scanner(System.in);
        System.out.println("Enter 4 number");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int numberC = scanner.nextInt();
        int numberD = scanner.nextInt();
        if (numberA > numberB && numberA > numberC && numberA > numberD) {
            System.out.println("A is largest number " + numberA);
        }else if (numberB > numberA && numberB > numberC && numberB > numberD) {
            System.out.println("B is largest number " + numberB);
        }else if (numberC > numberA && numberC > numberB && numberC > numberD) {
            System.out.println("C is largest number " + numberC);
        }else if (numberD > numberA && numberD > numberB && numberD > numberC) {
            System.out.println("D is largest number " + numberD);
        }else {
        	
        }

	}

}

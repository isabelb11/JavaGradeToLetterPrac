package grade;

public class SwitchCaseExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "tue";
		switch (day) {
		case "sat":
	   System.out.println("day is sat");
	   break;
		case "sun":
	   System.out.println("day is sun");
	   break;
	   case "mon":
	   System.out.println("day is mon");
	   break;
		case "tues":
	   System.out.println("day is tues");
	   break;
		case "wed":
	   System.out.println("day is wed");
	   break;
		case "thur":
	   System.out.println("day is thur");
	   break;
		case "fri":
	   System.out.println("day is fri");
	   break;
	   default:
		   System.out.println(" key was found");
		   
	   
	  }
		System.out.println("-----------");
		int x = 1;
		switch (x) {
		case 1:
			System.out.println("the value of x is one");
			break;
		case 2:
			System.out.println("the value of x is two");
			break;
			default: 
				System.out.println("value of x is out os the range of this switch logic");
		}
	}

}

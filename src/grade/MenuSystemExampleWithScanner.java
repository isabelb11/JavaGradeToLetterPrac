package grade;

public class MenuSystemExampleWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// menu
	     // 1. Login
	     // 2. Create Account
	     // you select an option
	     // 1. Login
	     // User Name:
	     // Password:
	     // give a message
	     // you select an option
	     // 2. Create Account
	     // UserName:
	     // First Name:
	     // Last Name:
	     // Email:
	     // Password:
	     // Confirm Password:
		
        
	// STEP 1. Create your variables
     scanner sc = new scanner(System.in);
     String userName = "";
     String firstName = "";
     String lastName = "";
     String email = "";
     String password = "";
     String userNameEntered = "";
     String passwordEntered = "";
     // STEP 2. print the menu options and expect/capture values from console
     System.out.println("1. Login");
     System.out.println("2. Create Account");
     int op1 = sc.nextInt();
     if (op1 == 1) {
         // Login flow
         System.out.println("Login:");
         System.out.println("Please provide User Name:");
         userNameEntered = sc.next();
         System.out.println("Please provide Password:");
         passwordEntered = sc.next();
         // STEP 3. compare the entered user and pass to the ones we have
         if(userNameEntered.equals(userName)) {
             // correct user name, check the password
             if(passwordEntered.equals(password)) {
                 // the pass was correct as well
                 System.out.println("USER & PASS were both verified!");
             } else {
                 System.out.println("Invalid Psssword!");
             }
         } else {
             // incorrect user name
             System.out.println("Invalid User Name!");
         }
     } else if (op1 == 2) {
         // Create flow
     } else {
         // out of range
         System.out.println("Your selection is not a valid option!");
     }
     

	}

}

package grade;

public class Practice1 {

	public static void main(String[] args) {
		 // 95 - 100 A+
        // 90 - 94 A-
        // 85 - 89 B+
        // 80 - 84 B-
        // 75 - 79 C+
        // 70 - 74 C-
        // 65 - 69 D+
        // 60 - 64 D-
        // 00 - 59 F
		
		double grade = 94;
        String res = "";

        if (grade >= 90) {
            res = grade >= 95 ? "A+" : "A-";
        } else if (grade >= 80) {
            res = "B";
        } else if (grade >= 70) {
            res = "C";
        } else if (grade >= 60) {
            res = "D";
        } else {
            res = "F";
        }

        System.out.println(res);
        
        

       
	}

}

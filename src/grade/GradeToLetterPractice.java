package grade;

public class GradeToLetterPractice {

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
		
		double grade = 75;
        String res = "";
        String res2 = "";
        
        if (grade >= 90) {
            res = grade >= 95 ? "A+" : "A-";
            res2 = "A";
        } else if (grade >= 80) {
            res = grade >= 85 ? "B+" : "B-";
            res2 = "B";
        } else if (grade >= 70) {
            res = grade >= 75 ? "C+" : "C-";
            res2 = "C";
        } else if (grade >= 60) {
            res = grade >= 65 ? "D+" : "D-";
            res2 = "D";
        } else {
            res = "F";
            res2 = "F";
        }
        if (grade > 99) {
            res2 += "+";
        } else {
            res2 += grade % 10 >= 5 ? "+" : "-";
        }
        
//      res2 += grade > 100 ? "+" : (grade % 10 >= 5 ? "+" : "-");
        
        System.out.println(res);
        System.out.println(res2);
            
            
           
            
            
        
        
		
		
		
	}

}

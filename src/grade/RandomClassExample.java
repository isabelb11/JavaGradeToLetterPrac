package grade;

import java.util.Random;

public class RandomClassExample {

	public static void main(String[] args) {
		// 
		Random rand = new Random();
		int x = rand.nextInt(10);
		
		int y = rand.nextInt(6) + 5;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
int z = rand.nextInt(22) + 78;

System.out.println("z = " + z);

int start = 10;
int end = 20;
int res = rand.nextInt(end - start + 1) + 10;
System.out.println("res = " + res);


		
		

	}

}

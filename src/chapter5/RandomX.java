package chapter5;

import java.util.Random;

/*Write a method named randomX that keeps printing lines, 
where each line contains a random number of x characters 
between 5 and 19 inclusive, until it prints a line with 16 
or more characters
*/

public class RandomX {

	public static void main(String[] args) {
		randomX();
	}
	
	public static void randomX() {
		int numChar = 0;
		Random random = new Random();
		while(numChar < 16) {
			numChar = random.nextInt(15) + 5;
			for(int i = 0; i < numChar; i++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}

}

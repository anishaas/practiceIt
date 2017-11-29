package chapter6;

import java.io.File;
import java.util.Scanner;

/*boyGirl: 
 * Write a method named boyGirl that accepts a Scanner as a parameter. 
 * The Scanner is reading its input from a file containing a series of 
 * names followed by integers. The names alternate between boys' names 
 * and girls' names. Your method should compute the absolute difference 
 * between the sum of the boys' integers and the sum of the girls' 
 * integers. The input could end with either a boy or girl; you may not
 * assume that it contains an even number of names.
 * 
 * evenNumbers:
 * Write a method named evenNumbers that accepts a Scanner as a 
 * parameter reading input from a file containing a series of integers, 
 * and report various statistics about the integers. You may assume 
 * that there is at least one integer in the file. Report the total 
 * number of numbers, the sum of the numbers, the count of even numbers 
 * and the percent of even numbers.
 * 
 * negativeSum:
 * Write a method named negativeSum that accepts a Scanner as a 
 * parameter reading input from a file containing a series of integers, 
 * and determine whether the sum starting from the first number is ever 
 * negative. The method should print a message indicating whether a 
 * negative sum is possible and should return true if a negative sum 
 * can be reached and false if not. For example, if the file contains 
 * the following text, your method will consider the sum of just one 
 * number (38), the sum of the first two numbers (38 + 4), the sum of 
 * the first three numbers (38 + 4 + 19), and so on up to the sum of 
 * all of the numbers:
 */

public class FilePractice {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("src/chapter6/tas.txt"));
		Scanner input2 = new Scanner(new File("src/chapter6/nums.txt"));
		Scanner input3 = new Scanner(new File("src/chapter6/negs.txt"));
		boyGirl(input);
		System.out.println();
		evenNumbers(input2);
		System.out.println();
		negativeSum(input3);
	}
	
	public static void negativeSum(Scanner input) {
		int sum = 0;
		boolean negative = false;
		int steps = 0;
		while(input.hasNext()) {
			steps++;
			sum += input.nextInt();
			if(sum < 0) {
				negative = true;
				break;
			}
		}
		if(negative) {
			System.out.println(sum + " after " + steps);
		} else {
			System.out.println("no negative sum");
		}
	}
	
	public static void boyGirl(Scanner input) {
		int boys = 0;
		int girls = 0;
		int bsum = 0;
		int gsum = 0;
		while(input.hasNext()) {
			input.next();
			bsum += input.nextInt();
			boys++;
			
			if(!input.hasNext()) 
				break;
			
			input.next();
			gsum += input.nextInt();
			girls++;
		}
		System.out.println(boys + " boys, " + girls + " girls.");
		System.out.println("Difference betweens sums = " + Math.abs(bsum - gsum));
	}
	
	public static void evenNumbers(Scanner input) {
	    double total = 0.0;
	    int sum = 0;
	    int numEven = 0;
	    double percentEven = 0.0;
	    while(input.hasNext()) {
	        int num = input.nextInt();
	        sum += num;
	        total++;
	        if(num % 2 == 0) {
	            numEven++;
	        }
	    }
	    percentEven = (double)Math.round((numEven/total) * 10000)/ 100;
	    System.out.println(total + " numbers, sum = " + sum);
	    System.out.println(numEven + " evens (" + percentEven + "%)");
	}

}

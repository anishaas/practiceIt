package chapter6;

import java.io.File;
import java.util.Scanner;

public class FileLineProcessing {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("src/chapter6/poem.txt"));
		Scanner input2 = new Scanner(new File("src/chapter6/hours.txt"));
		hoursWorked(input2);
		System.out.println();
	}
	
	private static void hoursWorked(Scanner input) {
		//Scanner for file
		while(input.hasNextLine()) {
				String text = input.nextLine();
				processLine(text);
			}
			System.out.println();
		}
	
	//method to handle individual lines
	private static void processLine(String text) {
		Scanner data = new Scanner(text);
		int id = data.nextInt();
		String name = data.next();
		double sum = 0.0;
		while(data.hasNextDouble()) {
			sum += data.nextDouble();
		}
		System.out.print("Total hours worked by " + name + " " + 
				"(id#" + id + ") = " + sum);
	}


	//line processing
	private static void echoUppercase(Scanner input) {
		while(input.hasNextLine()) {
			System.out.println(input.nextLine().toUpperCase());
		}
	}
	
	//attempted token processing, should not work
	private static void echoUppercaseToken(Scanner input) {
		while(input.hasNext()) {
			System.out.println(input.next().toUpperCase() + " ");
		}
	}

}

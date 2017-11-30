package chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintEntireLine {

	public static void main(String[] args)  throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter file name: ");
		String fileName = sc.nextLine();
		Scanner input = new Scanner(new File("src/chapter6/" + fileName));
		printEntireLine(input);
		
		System.out.println();
		Scanner input2 = new Scanner(new File("src/chapter6/box.txt"));
		printBox(input2, 14);
		
		System.out.println();
		fileOutput();
		
	}
	
	private static void fileOutput() throws FileNotFoundException {
		PrintStream out = new PrintStream(new File("message.txt"));
		out.println("Testing,");
		out.println("1, 2, 3.");
		out.println();
		out.println("This is my output file."); 
	}

	private static void printEntireLine(Scanner input) {
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
	}
	
	@SuppressWarnings("resource")
	public static void printBox(Scanner input, int width) {
		//print top border
		printBorder(width);
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			System.out.print("| " + line);
		for (int i = line.length(); i < width; i++) {
			System.out.print(" ");
		}
			System.out.println(" |");
		}
		
		//print bottom border
		printBorder(width);
	}
	
	public static void printBorder(int width) {
		System.out.print("+");
		for (int i = 0; i < width + 2; i++) {
			System.out.print("-");
		}
			System.out.println("+");
	}


}

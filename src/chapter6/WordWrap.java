package chapter6;

/* Write a method called wordWrap that accepts a Scanner representing an input 
 * file as its parameter and outputs each line of the file to the console, 
 * word-wrapping all lines that are longer than 60 characters.
 */

import java.util.Scanner;

public class WordWrap {

	public static void main(String[] args) {
	}
	
	public static void wordWrap(Scanner input) {
		while(input.hasNextLine()) {
			String line = input.nextLine();
			while(line.length() > 60) {
				System.out.println(line.substring(0, 60));
				line = line.substring(60);
			}
			System.out.println(line);
		}
	}

}

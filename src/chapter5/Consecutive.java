package chapter5;

/*Write a method named consecutive that accepts three integers as 
parameters and returns true if they are three consecutive numbers; 
that is, if the numbers can be arranged into an order such that 
there is some integer k such that the parameters' values are k, 
k+1, and k+2. Your method should return false if the integers are 
not consecutive. Note that order is not significant; 
your method should return the same result for the same three integers 
passed in any order.
*/

public class Consecutive {
	
	public static void main(String[] args) {
		//false
		System.out.println(consecutive(1, 2, 2));
		System.out.println(consecutive(7, 7, 9));
		System.out.println(consecutive(3, 5, 7));
		
		System.out.println();
		
		//true
		System.out.println(consecutive(3, 2, 4));
		System.out.println(consecutive(1, 2, 3));
		System.out.println(consecutive(-10, -8, -9));
	}
	
	public static boolean consecutive(int a, int b, int c) {
		if(a == b || a == c || b == c) {
			return false;
		}
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b,c));
		return (max - min == 2);
	}

}

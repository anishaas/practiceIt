package chapter5;

import java.util.Random;

/* Write a method named randomWalk that performs a random one-dimensional 
  walk, reporting each position reached and the maximum position reached 
  during the walk. The random walk should begin at position 0. On each step, 
  you should either increase or decrease the position by 1 (with equal 
  probability). The walk stops when 3 or -3 is hit.
 */

public class RandomWalk {
	
	public static void main(String[] args) {
		randomWalk();
	}
	
	public static void randomWalk() {
		int position = 0;
		int step = 0;
		int max = 0;
		Random random = new Random();
		while(Math.abs(position) != 3) {
			System.out.println("position = " + position);
			step = random.nextBoolean() ? -1 : 1;
			position += step;
			max = Math.max(max, position);
		}
		//print final position
		System.out.println(position);
		System.out.println("max position = " + max);
	}
}

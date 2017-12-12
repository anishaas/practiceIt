package chapter7;

//Write a static method named range that takes an array of integers 
//as a parameter and returns the range of values contained in the array. 
//The range of an array is defined to be one more than the difference 
//between its largest and smallest element. For example, if the largest 
//element in the array is 15 and the smallest is 4, the range is 12. 
//If the largest and smallest values are the same, the range is 1.

public class Range {

	public static void main(String[] args) {
		int[] a1 = {15, 22, 8, 19, 31};
		System.out.println(range(a1));
	}

	private static int range(int[] a1) {
		int min = a1[0]; 
		int max = a1[0]; 
		for(int i = 1; i < a1.length; i++) {
			if(a1[i] < min) {
				min = a1[i];
			} else if(a1[i] > max) {
				max = a1[i];
			}
		}
		return (max - min) + 1;
	}
	
	public int countInRange(int[] arr, int min, int max) {
	    int numBeyond = 0;
	    for(int i = 0; i < arr.length; i++) {
	        if(arr[i] < min || arr[i] > max) {
	            numBeyond++;
	        }
	    }
	    return (arr.length - numBeyond);
	}

}

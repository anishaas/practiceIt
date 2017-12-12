package chapter7;

public class LastIndexOf {

	public static void main(String[] args) {

	}

	public int lastIndexOf(int[] arr, int val) {
	    for(int i = arr.length - 1; i >= 0; i--) {
	        if(arr[i] == val) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	public boolean isSorted(double[] arr) {
	    boolean sorted = true;
	    for(int i = 0; i < arr.length - 1; i++) {
	        if(!(arr[i] < arr[i+1])) {
	            sorted = false;
	        }
	    }
	    return sorted;
	}
	
}

package chapter5;

/*Write a method named gcd that accepts two integers as parameters 
and returns the greatest common divisor of the two numbers. 
The greatest common divisor (GCD) of two integers a and b is 
the largest integer that is a factor of both a and b. 
The GCD of any number and 1 is 1, and the GCD of any number and 0 
is that number.
*/

public class GCD {

	public static void main(String[] args) {
		//should equal 12
		System.out.println(gcdRecursive(24, 84));
		System.out.println(gcdEuclidean(24, 84));
		System.out.println(gcd(24, 84));
		
		System.out.println();
		
		//should equal 15
		System.out.println(gcdRecursive(105, 45));
		System.out.println(gcdEuclidean(105, 45));;
		System.out.println(gcd(105, 45));
	}
	
	//recursive solution
	public static int gcdRecursive(int a, int b) {
		//base cases
		if(a == b) {
			return a;
		} else if(a == 0) {
			return b;
		} else if(b == 0) {
			return a;
		} else if(b == 0) {
			return a;
		} else return gcdRecursive(b,a % b);
	}
	
	//euclidean solution
	public static int gcdEuclidean(int a, int b) {
		while(b != 0) {
			int temp = a;
			a = b;
			b = (temp % b);
		}
		return Math.abs(a);
	}
	
	public static int gcd(int n1, int n2) {
		int gcd = 0;
		if(n1 == 0)  {
			gcd = n2;
		} else if(n2 == 0) {
            gcd = n1;
        } else if(n1 == 1 || n2 == 1) {
			gcd = 1;
		} else if(n1 == n2) {
            gcd = n1;
        }else {
			int min = Math.min(Math.abs(n1), Math.abs(n2));
			for(int i = min; i > 0; i--) {
				if(n1 % i == 0 && n2 % i == 0) {
					gcd = i;
                    break;
				}
			}
		}
        return gcd;
	}

}

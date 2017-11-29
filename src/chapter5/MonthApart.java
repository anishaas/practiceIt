package chapter5;

/*Write a method named monthApart that accepts four integer parameters 
 * representing two calendar dates. Each date consists of a month 
 * (1 through 12) and a day (1 through the number of days in that month
 *[28-31]). The method returns whether the dates are at least a month 
 *apart. Assume that all dates in this problem occur during the same 
 *year. For example, the following dates are all considered to be at 
 *least a month apart from 9/19 (September 19): 
 *2/14, 7/25, 8/2, 8/19, 10/19, 10/20, and 11/5. 
 *The following dates are NOT at least a month apart from 
 *9/19: 9/20, 9/28, 10/1, 10/15, and 10/18. 
 *Note that the first date could come before or after (or be the same 
 *as) the second date. Assume that all parameter values passed are 
 *valid.
 */

public class MonthApart {

	public static void main(String[] args) {
		System.out.println(monthApart(6, 14, 9, 21));
	
	}
	
	public static boolean monthApart(int m1, int d1, int m2, int d2) {
	    boolean monthsAway = false;
	    //month far apart
	    if(Math.abs(m1 - m2) > 1) {
	    	monthsAway = true;
	    //next month day - previous month day
	    } else if(m1 > m2) {
	    	monthsAway = d1 - d2 >= 0;
	    } else if(m2 > m1) {
	    	monthsAway = d2 - d1 >= 0;
	    }
	    return monthsAway;
	}

}

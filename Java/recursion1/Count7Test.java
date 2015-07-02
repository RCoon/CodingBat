package recursion1;

/*
 * Given a non-negative int n, return the count of the occurrences of 7 as a
 * digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10
 * yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
 * the rightmost digit (126 / 10 is 12).
 * 
 * count7(717) --> 2
 * count7(7) --> 1
 * count7(123) --> 0
 */

public class Count7Test {

	public static void main(String[] args) {
		Count7Test test = new Count7Test();
		System.out.println(test.count7(717));
		System.out.println(test.count7(7));
		System.out.println(test.count7(123));
	}
	
	public int count7(int n) {
	    if (n == 0) {
	        return 0;
	    } else if (n % 10 == 7) {
	        return 1 + count7(n / 10);
	    } else {
	        return count7(n / 10);
	    }
	}
}

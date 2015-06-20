package recursion1;

/*
 * Given a non-negative int n, return the sum of its digits recursively
 * (no loops). Note that mod (%) by 10 yields the rightmost digit
 * (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit
 * (126 / 10 is 12).
 * 
 * sumDigits(126) -> 9
 * sumDigits(49) -> 13
 * sumDigits(12) -> 3
 */

public class SumDigitsTest {
	
	public static void main(String[] args) {
	    SumDigitsTest test = new SumDigitsTest();
	    System.out.println(test.sumDigits(126));
	    System.out.println(test.sumDigits(49));
	    System.out.println(test.sumDigits(12));
	}
	
	public int sumDigits(int n) {
	    if (n / 10 == 0) {
	        return n;
	    } else {
	        return (n % 10) + sumDigits(n / 10);
	    }
	}
}
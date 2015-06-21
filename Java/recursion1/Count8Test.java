package recursion1;

/*
 * Given a non-negative int n, compute recursively (no loops) the count of the
 * occurrences of 8 as a digit, except that an 8 with another 8 immediately to
 * its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the
 * rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost
 * digit (126 / 10 is 12).
 * 
 * count8(8) -> 1
 * count8(818) -> 2
 * count8(8818) -> 4
 */

public class Count8Test {
    public static void main(String[] args) {
		Count8Test test = new Count8Test();
		System.out.println(test.count8(8));
		System.out.println(test.count8(818));
		System.out.println(test.count8(8818));
	}
    
    public int count8(int n) {
    	  if (n == 0) {
    	      return 0;
    	  } else if (n % 10 == 8) {
    	      if (n % 100 == 88) {
    	          return 2 + count8(n / 10);
    	      } else {
    	          return 1 + count8(n / 10);
    	      }
    	  } else {
    	      return count8(n / 10);
    	  }
    }
}
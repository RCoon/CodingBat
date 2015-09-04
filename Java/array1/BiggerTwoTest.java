package array1;

import java.util.Arrays;

/*
 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the
 * values in each array. Return the array which has the largest sum. In event of
 * a tie, return a.
 * 
 * biggerTwo({1, 2}, {3, 4}) --> {3, 4}
 * biggerTwo({3, 4}, {1, 2}) --> {3, 4}
 * biggerTwo({1, 1}, {1, 2}) --> {1, 2}
 */
public class BiggerTwoTest {

	public static void main(String[] args) {
		BiggerTwoTest test = new BiggerTwoTest();
		System.out.println(Arrays.toString(test.biggerTwo(
			new int[] {1, 2}, new int[] {3, 4})));
		System.out.println(Arrays.toString(test.biggerTwo(
			new int[] {3, 4}, new int[] {1, 2})));
		System.out.println(Arrays.toString(test.biggerTwo(
			new int[] {1, 1}, new int[] {1, 2})));
	}
	
	public int[] biggerTwo(int[] a, int[] b) {
		  int totalA = 0;
		  int totalB = 0;
		  
		  totalA = a[0] + a[1];
		  totalB = b[0] + b[1];
		  
		  if (totalA >= totalB) {
		    return a;
		  } else {
		    return b;
		  }
		}
}
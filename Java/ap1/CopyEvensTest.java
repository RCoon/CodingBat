package ap1;

import java.util.Arrays;

/*
 * Given an array of positive ints, return a new array of length "count"
 * containing the first even numbers from the original array. The original
 * array will contain at least "count" even numbers.
 * 
 * copyEvens({3, 2, 4, 5, 8}, 2) --> {2, 4}
 * copyEvens({3, 2, 4, 5, 8}, 3) --> {2, 4, 8}
 * copyEvens({6, 1, 2, 4, 5, 8}, 3) --> {6, 2, 4}
 */

public class CopyEvensTest {
    public static void main(String[] args) {
		CopyEvensTest test = new CopyEvensTest();
		System.out.println(Arrays.toString(
						   test.copyEvens(new int[] {3, 2, 4, 5, 8}, 2)));
		System.out.println(Arrays.toString(
						   test.copyEvens(new int[] {3, 2, 4, 5, 8}, 2)));
		System.out.println(Arrays.toString(
						   test.copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 3)));
	}
    
    public int[] copyEvens(int[] nums, int count) {
        int[] newNums = new int[count];
        int numEvens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && numEvens < count) {
                newNums[numEvens] = nums[i];
                numEvens++;
            }
        }
        return newNums;
    }
}
package array1;

import java.util.Arrays;

/*
 * Given an array of ints, return a new array length 2 containing the first and
 * last elements from the original array. The original array will be length 1 or
 * more.
 * 
 * makeEnds({1, 2, 3}) --> {1, 3}
 * makeEnds({1, 2, 3, 4}) --> {1, 4}
 * makeEnds({7, 4, 6, 2}) --> {7, 2}
 */
public class MakeEndsTest {

	public static void main(String[] args) {
		MakeEndsTest test = new MakeEndsTest();
		System.out.println(Arrays.toString(
						   test.makeEnds(new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(
						   test.makeEnds(new int[] {1, 2, 3, 4})));
		System.out.println(Arrays.toString(
						   test.makeEnds(new int[] {7, 4, 6, 2})));
	}
	
	public int[] makeEnds(int[] nums) {
		  int[] firstLast = new int[2];
		  
		  firstLast[0] = nums[0];
		  
		  
		  firstLast[1] = nums[nums.length - 1];
		  
		  
		  return firstLast;
		}
}
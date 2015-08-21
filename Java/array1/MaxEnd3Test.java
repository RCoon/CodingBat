package array1;

import java.util.Arrays;

/*
 * Given an array of ints length 3, figure out which is larger between the
 * first and last elements in the array, and set all the other elements to be
 * that value. Return the changed array.
 * 
 * maxEnd3({1, 2, 3}) --> {3, 3, 3}
 * maxEnd3({11, 5, 9}) --> {11, 11, 11}
 * maxEnd3({2, 11, 3}) --> {3, 3, 3}
 */
public class MaxEnd3Test {

	public static void main(String[] args) {
		MaxEnd3Test test = new MaxEnd3Test();
		System.out.println(Arrays.toString(
						   test.maxEnd3(new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(
						   test.maxEnd3(new int[] {11, 5, 9})));
		System.out.println(Arrays.toString(
						   test.maxEnd3(new int[] {2, 11, 3})));
	}
	
	public int[] maxEnd3(int[] nums) {
		  if (nums[0] >= nums[2]) {
		    nums[1] = nums[0];
		    nums[2] = nums[0];
		  } else {
		    nums[0] = nums[2];
		    nums[1] = nums[2];
		  }
		  return nums;
		}
}
package array1;

import java.util.Arrays;

/*
 * Given an array of ints of even length, return a new array length 2 containing
 * the middle two elements from the original array. The original array will be
 * length 2 or more.
 * 
 * makeMiddle({1, 2, 3, 4}) --> {2, 3}
 * makeMiddle({7, 1, 2, 3, 4, 9}) --> {2, 3}
 * makeMiddle({1, 2}) --> {1, 2}
 */
public class MakeMiddleTest {

	public static void main(String[] args) {
		MakeMiddleTest test = new MakeMiddleTest();
		System.out.println(Arrays.toString(test.makeMiddle(
			new int[] {1, 2, 3, 4})));
		System.out.println(Arrays.toString(test.makeMiddle(
			new int[] {7, 1, 2, 3, 4, 9})));
		System.out.println(Arrays.toString(test.makeMiddle(
			new int[] {1, 2})));
	}
	
	public int[] makeMiddle(int[] nums) {
		  if (nums.length == 2) return nums;
		  
		  int[] array = new int[2];
		  
		  array[0] = nums[(nums.length / 2) - 1];
		  array[1] = nums[nums.length / 2];
		  
		  return array;
		}
}
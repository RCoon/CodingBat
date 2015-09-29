package array1;

import java.util.Arrays;

/*
 * Given an array of ints of odd length, return a new array length 3 containing
 * the elements from the middle of the array. The array length will be at least
 * 3.
 * 
 * midThree({1, 2, 3, 4, 5}) --> {2, 3, 4}
 * midThree({8, 6, 7, 5, 3, 0, 9}) --> {7, 5, 3}
 * midThree({1, 2, 3}) --> {1, 2, 3}
 */
public class MidThreeTest {

	public static void main(String[] args) {
		MidThreeTest test = new MidThreeTest();
		System.out.println(Arrays.toString(
			test.midThree(new int[] {1, 2, 3, 4, 5})));
		System.out.println(Arrays.toString(
			test.midThree(new int[] {8, 6, 7, 5, 3, 0, 9})));
		System.out.println(Arrays.toString(
			test.midThree(new int[] {1, 2, 3})));
	}
	
	public int[] midThree(int[] nums) {
		  int[] array = new int[3];
		  
		  if (nums.length == 3) return nums;
		  
		  int halfway = nums.length / 2;
		  
		  array[0] = nums[halfway - 1];
		  array[1] = nums[halfway];
		  array[2] = nums[halfway + 1];
		  
		  return array;
		}
}
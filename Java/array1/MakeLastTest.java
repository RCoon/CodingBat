package array1;

import java.util.Arrays;

/*
 * Given an int array, return a new array with double the length where its last
 * element is the same as the original array, and all the other elements are 0.
 * The original array will be length 1 or more. Note: by default, a new int
 * array contains all 0's.
 * 
 * makeLast({4, 5, 6}) --> {0, 0, 0, 0, 0, 6}
 * makeLast({1, 2}) --> {0, 0, 0, 2}
 * makeLast({3}) --> {0, 3}
 */
public class MakeLastTest {

    public static void main(String[] args) {
		MakeLastTest test = new MakeLastTest();
		System.out.println(Arrays.toString(test.makeLast(new int[] {4, 5, 6})));
		System.out.println(Arrays.toString(test.makeLast(new int[] {1, 2})));
		System.out.println(Arrays.toString(test.makeLast(new int[] {3})));
	}
	
	public int[] makeLast(int[] nums) {
		  int[] array = new int[nums.length * 2];
		  
		  array[array.length - 1] = nums[nums.length - 1];
		  
		  return array;
	}
}
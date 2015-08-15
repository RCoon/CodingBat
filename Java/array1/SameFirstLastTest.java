package array1;

/*
 * Given an array of ints, return true if the array is length 1 or more, and
 * the first element and the last element are equal.
 * 
 * sameFirstLast({1, 2, 3}) --> false
 * sameFirstLast({1, 2, 3, 1}) --> true
 * sameFirstLast({1, 2, 1}) --> true
 */

public class SameFirstLastTest {
    public static void main(String[] args) {
		SameFirstLastTest test = new SameFirstLastTest();
		System.out.println(test.sameFirstLast(new int[] {1, 2, 3}));
		System.out.println(test.sameFirstLast(new int[] {1, 2, 3, 1}));
		System.out.println(test.sameFirstLast(new int[] {1, 2, 1}));
	}
    
    public boolean sameFirstLast(int[] nums) {
    	  return (nums.length >= 1 && (nums[0] == nums[nums.length - 1]));
    	}
}
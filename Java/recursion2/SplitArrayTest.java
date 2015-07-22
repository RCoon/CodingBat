package recursion2;

import java.util.Arrays;

/*
 * Given an array of ints, is it possible to divide the ints into two groups,
 * so that the sums of the two groups are the same. Every int must be in one
 * group or the other. Write a recursive helper method that takes whatever
 * arguments you like, and make the initial call to your recursive helper
 * from splitArray(). (No loops needed.)
 * 
 * splitArray({2, 2}) --> true
 * splitArray({2, 3}) --> false
 * splitArray({5, 2, 3}) --> true
 */

public class SplitArrayTest {
    public static void main(String[] args) {
		SplitArrayTest test = new SplitArrayTest();
		System.out.println(test.splitArray(new int[] {2,2,10,10,1,1}));
	}
    
    // Solution from Stuart Molnar
    // https://gist.github.com/StuartMolnar/c647e00e480fcb3cdc70
    public boolean splitArray(int[] nums) {
    	return (nums.length == 2) ? (nums[0] == nums[1])
    					          : (nums.length == 0 || total(nums) % 2 == 0);
    }

    public int total(int[] arr) {
        return (arr.length > 1) ? (arr[arr.length - 1]
        				        + total(Arrays.copyOf(arr, arr.length - 1)))
        				        : arr[0];
    }
}
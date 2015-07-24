package recursion2;

/*
 * Given an array of ints, is it possible to divide the ints into two groups,
 * so that the sum of one group is a multiple of 10, and the sum of the other
 * group is odd. Every int must be in one group or the other. Write a
 * recursive helper method that takes whatever arguments you like, and make
 * the initial call to your recursive helper from splitOdd10().
 * (No loops needed.)
 * 
 * splitOdd10({5, 5, 5}) --> true
 * splitOdd10({5, 5, 6}) --> false
 * splitOdd10({5, 5, 6, 1}) --> true
 */

public class SplitOdd10Test {
    public static void main(String[] args) {
		SplitOdd10Test test = new SplitOdd10Test();
		System.out.println(test.splitOdd10(new int[] {5, 5, 5}));
		System.out.println(test.splitOdd10(new int[] {5, 5, 6}));
		System.out.println(test.splitOdd10(new int[] {5, 5, 6, 1}));
	}
    
    public boolean splitOdd10(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    public boolean helper(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length) {
            return ((sum1 % 10 == 0 && sum2 % 2 == 1)
                || (sum2 % 10 == 0 && sum1 % 2 == 1));
        }
        
        return helper(start + 1, nums, sum1 + nums[start], sum2)
            || helper(start + 1, nums, sum1, sum2 + nums[start]);
    }
}
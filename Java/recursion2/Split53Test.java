package recursion2;

/*
 * Given an array of ints, is it possible to divide the ints into two groups,
 * so that the sum of the two groups is the same, with these constraints:
 * all the values that are multiple of 5 must be in one group, and all the
 * values that are a multiple of 3 (and not a multiple of 5) must be in the
 * other. (No loops needed.)
 * 
 * split53({1,1}) --> true
 * split53({1, 1, 1}) --> false
 * split53({2, 4, 2}) --> true
 */

public class Split53Test {
    public static void main(String[] args) {
		Split53Test test = new Split53Test();
		System.out.println(test.split53(new int[] {1, 1}));
		System.out.println(test.split53(new int[] {1, 1, 1}));
		System.out.println(test.split53(new int[] {2, 4, 2}));
	}
    
    public boolean split53(int[] nums) {
        return helper(0, nums, 0, 0);
    }

    public boolean helper(int start, int[] nums, int sum5, int sum3) {
        if (start >= nums.length) {
            return sum5 == sum3;
        } else if (nums[start] % 5 == 0) {
            return helper(start + 1, nums, sum5 + nums[start], sum3);
        } else if (nums[start] % 3 == 0) {
            return helper(start + 1, nums, sum5, sum3 + nums[start]);
        } else {
            return helper(start + 1, nums, sum5 + nums[start], sum3)
                || helper(start + 1, nums, sum5, sum3 + nums[start]);
        }
    }
}
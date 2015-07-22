package recursion2;

/*
 * Given an array of ints, is it possible to choose a group of some of the
 * ints, such that the group sums to the given target, with this additional
 * constraint: if there are numbers in the array that are adjacent and the
 * identical value, they must either all be chosen, or none of them chosen.
 * For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in
 * the middle must be chosen or not, all as a group. (one loop can be used
 * to find the extent of the identical values).
 * 
 * groupSumClump(0, {2, 4, 8}, 10) --> true
 * groupSumClump(0, {1, 2, 4, 8, 1}, 14) --> true
 * groupSumClump(0, {2, 4, 4, 8}, 14) --> false
 */

public class GroupSumClumpTest {
    public static void main(String[] args) {
		GroupSumClumpTest test = new GroupSumClumpTest();
		System.out.println(test.groupSumClump(0, new int[] {2, 4, 8}, 10));
		System.out.println(test.groupSumClump(0, new int[] {1,2,4,8,1}, 14));
		System.out.println(test.groupSumClump(0, new int[] {2,4,4,8}, 14));
	}
    
    public boolean groupSumClump(int start, int[] nums, int target) {
        // Base case: if there are no numbers left, then there is a
        // solution only if target is 0.
        if (start >= nums.length) return (target == 0);
        
        // If adjacent numbers are identical, count each number and the sum
        // of the numbers.  Return true if either using all of them or not
        // using any of them returns true.
        if ((start + 1 <= nums.length - 1) && nums[start] == nums[start + 1]) {
            int total = 0;
            int countNums = 0;
            for (int i = start; i < nums.length; i++) {
                if (nums[i] == nums[start]) {
                    total += nums[i];
                    countNums++;
                }
            }
            if (groupSumClump(start + countNums, nums, target - total)) {
                return true;
            } else if (groupSumClump(start + countNums, nums, target)) {
                return true;
            } else {
                return false;
            }
        }
        // Recursive call trying the case that nums[start] is chosen --
        // subtract it from target in the call.
        if (groupSumClump(start + 1, nums, target - nums[start])) return true;
      
        // Recursive call trying the case that nums[start] is not chosen.
        if (groupSumClump(start + 1, nums, target)) return true;
      
        // If neither of the above worked, it's not possible.
        return false;
    }
}
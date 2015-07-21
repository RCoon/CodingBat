package recursion2;

/*
 * Given an array of ints, is it possible to choose a group of some of the
 * ints, such that the group sums to the given target with these additional
 * constraints: all multiples of 5 in the array must be included in the
 * group. If the value immediately following a multiple of 5 is 1, it must
 * not be chosen. (No loops needed.)
 * 
 * groupSum5(0, {2, 5, 10, 4}, 19) --> true
 * groupSum5(0, {2, 5, 10, 4}, 17) --> true
 * groupSum5(0, {2, 5, 10, 4}, 12) --> false
 */

public class GroupSum5Test {
    public static void main(String[] args) {
		GroupSum5Test test = new GroupSum5Test();
		System.out.println(test.groupSum5(0, new int[] {2, 5, 10, 4}, 19));
		System.out.println(test.groupSum5(0, new int[] {2, 5, 10, 4}, 17));
		System.out.println(test.groupSum5(0, new int[] {2, 5, 10, 4}, 12));
	}
    
    public boolean groupSum5(int start, int[] nums, int target) {
        // Base case: if there are no numbers left, then there is a
        // solution only if target is 0.
        if (start >= nums.length) return (target == 0);
        
        // If nums[start] is a multiple of 5, include it in the group
        // and if the next value in the array is a 1, skip over it.
        if (nums[start] % 5 == 0) {
            if ((start + 1) <= (nums.length - 1)) {
                if (nums[start + 1] == 1) {
                    return groupSum5(start + 2, nums, target - nums[start]);
                }
            }
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        // Recursive call trying the case that nums[start] is chosen --
        // subtract it from target in the call.
        if (groupSum5(start + 1, nums, target - nums[start])) return true;
      
        // Recursive call trying the case that nums[start] is not chosen.
        if (groupSum5(start + 1, nums, target)) return true;
      
        // If neither of the above worked, it's not possible.
        return false;
    }
}
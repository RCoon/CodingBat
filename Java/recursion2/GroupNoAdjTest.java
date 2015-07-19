package recursion2;

/*
 * Given an array of ints, is it possible to choose a group of some of the
 * ints, such that the group sums to the given target with this additional
 * constraint: If a value in the array is chosen to be in the group, the
 * value immediately following it in the array must not be chosen.
 * (No loops needed.)
 * 
 * groupNoAdj(0, {2, 5, 10, 4}, 12) --> true
 * groupNoAdj(0, {2, 5, 10, 4}, 14) --> false
 * groupNoAdj(0, {2, 5, 10, 4}, 7) --> false
 */

public class GroupNoAdjTest {
    public static void main(String[] args) {
		GroupNoAdjTest test = new GroupNoAdjTest();
		System.out.println(test.groupNoAdj(0, new int[] {2, 5, 10, 4}, 12));
		System.out.println(test.groupNoAdj(0, new int[] {2, 5, 10, 4}, 14));
		System.out.println(test.groupNoAdj(0, new int[] {2, 5, 10, 4}, 7));
	}
    
    public boolean groupNoAdj(int start, int[] nums, int target) {
        // Base case: if there are no numbers left, then there is a
        // solution only if target is 0.
        if (start >= nums.length) return (target == 0);
      
        // Recursive call trying the case that nums[start] is chosen --
        // subtract it from target in the call and move past the next value.
        if (groupNoAdj(start + 2, nums, target - nums[start])) return true;
      
        // Recursive call trying the case that nums[start] is not chosen.
        if (groupNoAdj(start + 1, nums, target)) return true;
      
        // If neither of the above worked, it's not possible.
        return false;
    }
}
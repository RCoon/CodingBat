package recursion2;

/*
 * Given an array of ints, is it possible to choose a group of some of the
 * ints, beginning at the start index, such that the group sums to the
 * given target? However, with the additional constraint that all 6's must
 * be chosen. (No loops needed.)
 * 
 * groupSum6(0, {5, 6, 2}, 8) --> true
 * groupSum6(0, {5, 6, 2}, 9) --> false
 * groupSum6(0, {5, 6, 2}, 7) --> false
 */

public class GroupSum6Test {
    public static void main(String[] args) {
		GroupSum6Test test = new GroupSum6Test();
		System.out.println(test.groupSum6(0, new int[] {5, 6, 2}, 8));
		System.out.println(test.groupSum6(0, new int[] {5, 6, 2}, 9));
		System.out.println(test.groupSum6(0, new int[] {5, 6, 2}, 7));
	}
    
    public boolean groupSum6(int start, int[] nums, int target) {
        // Base case: if there are no numbers left, then there is a
        // solution only if target is 0.
        if (start >= nums.length) return (target == 0);
        
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        } else if (groupSum6(start + 1, nums, target - nums[start])) {
            return true;
        } else if (groupSum6(start + 1, nums, target)) {
            return true;
        } else {
            return false;
        }
    }
}
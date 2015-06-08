package recursion2;

public class GroupSum {
	
	public static void main(String[] args) {
		GroupSum test = new GroupSum();
		System.out.println(test.groupSum(0, new int[] {2, 4, 8}, 10));
		System.out.println(test.groupSum(0, new int[] {2, 4, 8}, 14));
		System.out.println(test.groupSum(0, new int[] {2, 4, 8}, 9));
	}
	
	// Used provided solution on codingbat.com
	public boolean groupSum(int start, int[] nums, int target) {
		  // Base case: if there are no numbers left, then there is a
		  // solution only if target is 0.
		  if (start >= nums.length) return (target == 0);
		  
		  // Recursive call trying the case that nums[start] is chosen --
		  // subtract it from target in the call.
		  if (groupSum(start + 1, nums, target - nums[start])) return true;
		  
		  // Recursive call trying the case that nums[start] is not chosen.
		  if (groupSum(start + 1, nums, target)) return true;
		  
		  // If neither of the above worked, it's not possible.
		  return false;
		}
}
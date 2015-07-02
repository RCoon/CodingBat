package array3;

/*
 * Given a non-empty array, return true if there is a place to split the array
 * so that the sum of the numbers on one side is equal to the sum of the 
 * numbers on the other side.
 * 
 * canBalance({1, 1, 1, 2, 1}) --> true
 * canBalance({2, 1, 1, 2, 1}) --> false
 * canBalance({10, 10}) --> true
 */

public class CanBalance {
	
	public static void main(String[] args) {
		CanBalance test = new CanBalance();
		System.out.println(test.canBalance(new int[] {1, 1, 1, 2, 1}));
		System.out.println(test.canBalance(new int[] {2, 1, 1, 2, 1}));
		System.out.println(test.canBalance(new int[] {10, 10}));
	}

	public boolean canBalance(int[] nums) {
		  int total = 0;
		  int revTotal = 0;
		  
		  if (nums.length == 1) return false;
		  
		  for (int i = 0; i < nums.length; i++) {
		      total += nums[i];
		      for (int j = nums.length - 1; j > 0; j--) {
		          revTotal += nums[j];
		          if (j == i+1 && total == revTotal) return true;
		      }
		      revTotal = 0;
		  }
		  return false;
	}
}

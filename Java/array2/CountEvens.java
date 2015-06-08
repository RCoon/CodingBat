package array2;

/*
 * Return the number of even ints in the given array. Note: the % "mod" 
 * operator computes the remainder, e.g. 5 % 2 is 1.
 * 
 * countEvens({2, 1, 2, 3, 4}) -> 3
 * countEvens({2, 2, 0}) -> 3
 * countEvens({1, 3, 5}) -> 0
 */

public class CountEvens {
	
	public static void main(String[] args) {
		CountEvens test = new CountEvens();
		System.out.println(test.countEvens(new int[] {2, 1, 2, 3, 4}));
		System.out.println(test.countEvens(new int[] {2, 2, 0}));
		System.out.println(test.countEvens(new int[] {1, 3, 5}));
	}
	
	public int countEvens(int[] nums) {
		  int countEven = 0;
		  
		  for (int i = 0; i < nums.length; i++) {
		      if (nums[i] % 2 == 0) countEven++;
		  }
		  return countEven;
	}
}
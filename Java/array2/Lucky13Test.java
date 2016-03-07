package array2;

/*
 * Given an array of ints, return true if the array contains no 1's and no 3's.
 * 
 * lucky13({0, 2, 4}) --> true
 * lucky13({1, 2, 3}) --> false
 * lucky13({1, 2, 4}) --> false
 */
public class Lucky13Test {

	public static void main(String[] args) {
		
		Lucky13Test test = new Lucky13Test();
		System.out.println(test.lucky13(new int[] {0, 2, 4}));
		System.out.println(test.lucky13(new int[] {1, 2, 3}));
		System.out.println(test.lucky13(new int[] {1, 2, 4}));
	}
	
	public boolean lucky13(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 3)
				return false;
		}
		return true;
	}
}

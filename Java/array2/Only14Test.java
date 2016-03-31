package array2;

/*
 * Given an array of ints, return true if every element is a 1 or a 4.
 * 
 * only14({1, 4, 1, 4}) --> true
 * only14({1, 4, 2, 4}) --> false
 * only14({1, 1}) --> true
 */
public class Only14Test {

	public static void main(String[] args) {

		Only14Test test = new Only14Test();
		System.out.println(test.only14(new int[] {1, 4, 1, 4}));
		System.out.println(test.only14(new int[] {1, 4, 2, 4}));
		System.out.println(test.only14(new int[] {1, 1}));
	}

	public boolean only14(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4)
				return false;
		}
		return true;
	}
}

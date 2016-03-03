package array2;

/*
 * Given an array of ints, return true if the array contains a 2 next to a 2 or
 * a 4 next to a 4, but not both.
 * 
 * either24({1, 2, 2}) --> true
 * either24({4, 4, 1}) --> true
 * either24({4, 4, 1, 2, 2}) --> false
 */
public class Either24Test {

	public static void main(String[] args) {
		
		Either24Test test = new Either24Test();
		System.out.println(test.either24(new int[] {1, 2, 2}));
		System.out.println(test.either24(new int[] {4, 4, 1}));
		System.out.println(test.either24(new int[] {4, 4, 1, 2, 2}));
	}

	public boolean either24(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				if ((i + 3) >= nums.length)
					return true;
				for (int j = i + 2; j < nums.length - 1; j++) {
					if (nums[j] == 4 && nums[j + 1] == 4)
						return false;

				}
				return true;
			}
			if (nums[i] == 4 && nums[i + 1] == 4) {
				if ((i + 3) >= nums.length)
					return true;
				for (int j = i + 2; j < nums.length - 1; j++) {
					if (nums[j] == 2 && nums[j + 1] == 2)
						return false;

				}
				return true;
			}
		}
		return false;
	}
}

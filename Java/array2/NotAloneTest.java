package array2;

import java.util.Arrays;

public class NotAloneTest {

	public static void main(String[] args) {

		NotAloneTest test = new NotAloneTest();
		System.out.println(Arrays
						.toString(test.notAlone(new int[] { 1, 2, 3 }, 2)));
		System.out.println(Arrays.toString(
						test.notAlone(new int[] { 1, 2, 3, 2, 5, 2 }, 2)));
		System.out.println(
						Arrays.toString(test.notAlone(new int[] { 3, 4 }, 3)));
	}

	public int[] notAlone(int[] nums, int val) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				if (i > 0 && i < nums.length - 1) {
					if (nums[i - 1] != nums[i] && nums[i + 1] != nums[i]) {
						nums[i] = Math.max(nums[i - 1], nums[i + 1]);
					}
				}
			}
		}
		return nums;
	}
}

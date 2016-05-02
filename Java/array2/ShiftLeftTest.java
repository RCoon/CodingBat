package array2;

import java.util.Arrays;

public class ShiftLeftTest {

	public static void main(String[] args) {

		ShiftLeftTest test = new ShiftLeftTest();
		System.out.println(Arrays
						.toString(test.shiftLeft(new int[] { 6, 2, 5, 3 })));
		System.out.println(Arrays.toString(test.shiftLeft(new int[] { 1, 2 })));
		System.out.println(Arrays.toString(test.shiftLeft(new int[] { 1 })));
	}

	public int[] shiftLeft(int[] nums) {
		if (nums.length <= 1)
			return nums;

		int first = nums[0];

		for (int i = 1; i < nums.length; i++) {
			nums[i - 1] = nums[i];
		}
		nums[nums.length - 1] = first;

		return nums;
	}
}

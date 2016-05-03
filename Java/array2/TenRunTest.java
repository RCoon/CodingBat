package array2;

import java.util.Arrays;

public class TenRunTest {

	public static void main(String[] args) {

		TenRunTest test = new TenRunTest();
		System.out.println(Arrays.toString(
						test.tenRun(new int[] { 2, 10, 3, 4, 20, 5 })));
		System.out.println(Arrays
						.toString(test.tenRun(new int[] { 10, 1, 20, 2 })));
		System.out.println(Arrays
						.toString(test.tenRun(new int[] { 10, 1, 9, 20 })));
	}

	public int[] tenRun(int[] nums) {
		if (nums.length < 1)
			return nums;

		int replace = nums[0];
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0) {
				replace = nums[i];
				count++;
			}
			if (count > 0)
				nums[i] = replace;
		}
		return nums;
	}
}

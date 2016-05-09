package array2;

import java.util.Arrays;

public class ZeroMaxTest {

	public static void main(String[] args) {
		
		ZeroMaxTest test = new ZeroMaxTest();
		System.out.println(Arrays.toString(test.zeroMax(new int[] { 0, 5, 0, 3 })));
		System.out.println(Arrays.toString(test.zeroMax(new int[] { 0, 4, 0, 3 })));
		System.out.println(Arrays.toString(test.zeroMax(new int[] { 0, 1, 0 })));
	}

	public int[] zeroMax(int[] nums) {
		if (nums.length < 2)
			return nums;

		int[] array = new int[nums.length];

		int maxOdd = 0;

		for (int i = nums.length - 1; i > -1; i--) {
			if (nums[i] % 2 != 0 && nums[i] > maxOdd) {
				maxOdd = nums[i];
			}
			if (nums[i] != 0) {
				array[i] = nums[i];
			} else {
				array[i] = maxOdd;
			}
		}
		return array;
	}
}

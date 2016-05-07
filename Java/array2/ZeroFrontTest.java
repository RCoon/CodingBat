package array2;

import java.util.Arrays;

public class ZeroFrontTest {

	public static void main(String[] args) {

		ZeroFrontTest test = new ZeroFrontTest();
		System.out.println(Arrays
						.toString(test.zeroFront(new int[] { 1, 0, 0, 1 })));
		System.out.println(Arrays
						.toString(test.zeroFront(new int[] { 0, 1, 1, 0, 1 })));
		System.out.println(Arrays.toString(test.zeroFront(new int[] { 1, 0 })));
	}

	public int[] zeroFront(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = nums[count];
				nums[count] = 0;
				count++;
			}
		}
		return nums;
	}
}

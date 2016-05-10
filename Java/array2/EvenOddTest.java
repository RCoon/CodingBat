package array2;

import java.util.Arrays;

public class EvenOddTest {

	public static void main(String[] args) {

		EvenOddTest test = new EvenOddTest();
		System.out.println(Arrays.toString(
						test.evenOdd(new int[] { 1, 0, 1, 0, 0, 1, 1 })));
		System.out.println(
						Arrays.toString(test.evenOdd(new int[] { 3, 3, 2 })));
		System.out.println(
						Arrays.toString(test.evenOdd(new int[] { 2, 2, 2 })));
	}

	public int[] evenOdd(int[] nums) {
		int index = 0;
		int[] array = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				array[index] = nums[i];
				index++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				array[index] = nums[i];
				index++;
			}
		}
		return array;
	}
}

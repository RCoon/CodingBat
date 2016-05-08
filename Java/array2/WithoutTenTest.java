package array2;

import java.util.Arrays;

public class WithoutTenTest {

	public static void main(String[] args) {

		WithoutTenTest test = new WithoutTenTest();
		System.out.println(Arrays
						.toString(test.withoutTen(new int[] { 1, 10, 10, 2 })));
		System.out.println(Arrays
						.toString(test.withoutTen(new int[] { 10, 2, 10 })));
		System.out.println(Arrays
						.toString(test.withoutTen(new int[] { 1, 99, 10 })));
	}

	public int[] withoutTen(int[] nums) {
		int[] array = new int[nums.length];
		int index = 0;

		for (int i = 0; i < nums.length; i++)
			if (nums[i] != 10) {
				array[index] = nums[i];
				index++;
			}
		return array;
	}
}

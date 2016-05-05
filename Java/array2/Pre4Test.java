package array2;

import java.util.Arrays;

public class Pre4Test {

	public static void main(String[] args) {

		Pre4Test test = new Pre4Test();
		System.out.println(
						Arrays.toString(test.pre4(new int[] { 1, 2, 4, 1 })));
		System.out.println(
						Arrays.toString(test.pre4(new int[] { 3, 1, 4 })));
		System.out.println(
						Arrays.toString(test.pre4(new int[] { 1, 4, 4 })));
	}

	public int[] pre4(int[] nums) {
		int i;

		for (i = 0; i < nums.length; i++) {
			if (nums[i] == 4)
				break;
		}
		int[] array = new int[i];

		if (i == 0)
			return array;

		for (int j = 0; j < i; j++) {
			array[j] = nums[j];
		}
		return array;
	}
}

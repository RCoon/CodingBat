package array2;

import java.util.Arrays;

public class Post4Test {

	public static void main(String[] args) {

		Post4Test test = new Post4Test();
		System.out.println(
						Arrays.toString(test.post4(new int[] { 2, 4, 1, 2 })));
		System.out.println(
						Arrays.toString(test.post4(new int[] { 4, 1, 4, 2 })));
		System.out.println(Arrays
						.toString(test.post4(new int[] { 4, 4, 1, 2, 3 })));
	}

	public int[] post4(int[] nums) {
		int i;

		for (i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 4)
				break;
		}
		int[] array = new int[nums.length - 1 - i];

		if (i == nums.length - 1)
			return array;

		for (int j = 0; j < array.length; j++) {
			if (i + 1 < nums.length) {
				array[j] = nums[i + 1 + j];
			}
		}
		return array;
	}
}

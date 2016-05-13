package array3;

import java.util.Arrays;

public class Fix45Test {

	public static void main(String[] args) {

		Fix45Test test = new Fix45Test();
		System.out.println(Arrays
						.toString(test.fix45(new int[] { 5, 4, 9, 4, 9, 5 })));
		System.out.println(
						Arrays.toString(test.fix45(new int[] { 1, 4, 1, 5 })));
		System.out.println(Arrays.toString(
						test.fix45(new int[] { 1, 4, 1, 5, 5, 4, 1 })));
	}

	public int[] fix45(int[] nums) {
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4) {
				int pos5 = i;
				for (int j = 0; j < nums.length; j++)
					if (nums[j] == 4 && nums[j + 1] != 5) {
						int temp = nums[j + 1];
						nums[j + 1] = 5;
						nums[pos5] = temp;
						break;
					}
			}
		return nums;
	}
}

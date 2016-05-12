package array3;

import java.util.Arrays;

public class Fix34Test {

	public static void main(String[] args) {

		Fix34Test test = new Fix34Test();
		System.out.println(
						Arrays.toString(test.fix34(new int[] { 1, 3, 1, 4 })));
		System.out.println(Arrays.toString(
						test.fix34(new int[] { 1, 3, 1, 4, 4, 3, 1 })));
		System.out.println(
						Arrays.toString(test.fix34(new int[] { 3, 2, 2, 4 })));
	}

	public int[] fix34(int[] nums) {
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == 3) {
				int temp = nums[i + 1];
				nums[i + 1] = 4;
				for (int j = i + 2; j < nums.length; j++)
					if (nums[j] == 4)
						nums[j] = temp;
			}
		return nums;
	}
}

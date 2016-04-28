package array2;

public class TwoTwoTest {

	public static void main(String[] args) {

		TwoTwoTest test = new TwoTwoTest();
		System.out.println(test.twoTwo(new int[] { 4, 2, 2, 3 }));
		System.out.println(test.twoTwo(new int[] { 2, 2, 4 }));
		System.out.println(test.twoTwo(new int[] { 2, 2, 4, 2 }));
	}

	public boolean twoTwo(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				if (i > 0 && nums[i - 1] == 2)
					continue;
				if (i < nums.length - 1 && nums[i + 1] == 2)
					continue;
				return false;
			}
		}
		return true;
	}

}

package array2;

public class HaveThreeTest {

	public static void main(String[] args) {

		HaveThreeTest test = new HaveThreeTest();
		System.out.println(test.haveThree(new int[] { 3, 1, 3, 1, 3 }));
		System.out.println(test.haveThree(new int[] { 3, 1, 3, 3 }));
		System.out.println(test.haveThree(new int[] { 3, 4, 3, 3, 4 }));
	}

	public boolean haveThree(int[] nums) {
		int count3 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				count3++;
			}
			if (i > 0 && nums[i] == 3 && nums[i - 1] == 3)
				return false;
		}
		if (count3 == 3)
			return true;
		return false;
	}

}

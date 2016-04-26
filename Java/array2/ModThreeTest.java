package array2;

public class ModThreeTest {

	public static void main(String[] args) {

		ModThreeTest test = new ModThreeTest();
		System.out.println(test.modThree(new int[] { 2, 1, 3, 5 }));
		System.out.println(test.modThree(new int[] { 2, 1, 2, 5 }));
		System.out.println(test.modThree(new int[] { 2, 4, 2, 5 }));
	}

	public boolean modThree(int[] nums) {
		int countEven = 0;
		int countOdd = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				countEven++;
				if (countOdd > 0)
					countOdd = 0;
				if (countEven >= 3)
					return true;
			} else {
				countOdd++;
				if (countEven > 0)
					countEven = 0;
				if (countOdd >= 3)
					return true;
			}
		}
		return false;
	}
}

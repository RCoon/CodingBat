package array2;

public class SameEndsTest {

	public static void main(String[] args) {

		SameEndsTest test = new SameEndsTest();
		System.out.println(
						test.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 1));
		System.out.println(
						test.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 2));
		System.out.println(
						test.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 3));
	}

	public boolean sameEnds(int[] nums, int len) {
		if (len == 0)
			return true;

		for (int i = 0; i < len; i++) {
			if (nums[i] != nums[nums.length - len + i])
				return false;
		}
		return true;
	}
}

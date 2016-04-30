package array2;

public class TripleUpTest {

	public static void main(String[] args) {

		TripleUpTest test = new TripleUpTest();
		System.out.println(test.tripleUp(new int[] { 1, 4, 5, 6, 2 }));
		System.out.println(test.tripleUp(new int[] { 1, 2, 3 }));
		System.out.println(test.tripleUp(new int[] { 1, 2, 4 }));
	}

	public boolean tripleUp(int[] nums) {
		if (nums.length < 3)
			return false;

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2])
				return true;
		}
		return false;
	}
}

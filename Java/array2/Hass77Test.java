package array2;

public class Has77Test {

	public static void main(String[] args) {

		Has77Test test = new Has77Test();
		System.out.println(test.has77(new int[] { 1, 7, 7 }));
		System.out.println(test.has77(new int[] { 1, 7, 1, 7 }));
		System.out.println(test.has77(new int[] { 1, 7, 1, 1, 7 }));
	}

	public boolean has77(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 7 && (nums[i + 1] == 7
							|| (i < nums.length - 2 && nums[i + 2] == 7))) {
				return true;
			}
		}
		return false;
	}
}

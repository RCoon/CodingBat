package array2;

public class Has12Test {

	public static void main(String[] args) {

		Has12Test test = new Has12Test();
		System.out.println(test.has12(new int[] { 1, 3, 2 }));
		System.out.println(test.has12(new int[] { 3, 1, 2 }));
		System.out.println(test.has12(new int[] { 3, 1, 4, 5, 2 }));
	}

	public boolean has12(int[] nums) {
		boolean has1 = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				has1 = true;
			if (has1 && nums[i] == 2)
				return true;
		}
		return false;
	}
}

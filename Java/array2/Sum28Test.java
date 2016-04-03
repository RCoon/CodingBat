package array2;

public class Sum28Test {

	public static void main(String[] args) {
		
		Sum28Test test = new Sum28Test();
		System.out.println(test.sum28(new int[] {2, 3, 2, 2, 4, 2}));
		System.out.println(test.sum28(new int[] {2, 3, 2, 2, 4, 2, 2}));
		System.out.println(test.sum28(new int[] {1, 2, 3, 4}));
	}
	
	public boolean sum28(int[] nums) {
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2)
				sum += nums[i];
		}
		if (sum == 8)
			return true;

		return false;
	}
}

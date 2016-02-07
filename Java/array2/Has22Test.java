package array2;

/*
 * Given an array of ints, return true if the array contains a 2 next to a 2
 * somewhere.
 * 
 * has22({1, 2, 2}) --> true
 * has22({1, 2, 1, 2}) --> false
 * has22({2, 1, 2}) --> false
 */
public class Has22Test {

	public static void main(String[] args) {
		
		Has22Test test = new Has22Test();
		System.out.println(test.has22(new int[] {1, 2, 2}));
		System.out.println(test.has22(new int[] {1, 2, 1, 2}));
		System.out.println(test.has22(new int[] {2, 1, 2}));
	}
	
	public boolean has22(int[] nums) {
		
		if (nums.length < 2)
			return false;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2)
				return true;
		}
		return false;
	}
}

package array1;

/*
 * Given an int array length 2, return true if it contains a 2 or a 3.
 * 
 * has23({2, 5}) --> true
 * has23({4, 3}) --> true
 * has23({4, 5}) --> false
 */
public class Has23Test {

	public static void main(String[] args) {
		Has23Test test = new Has23Test();
		System.out.println(test.has23(new int[] {2, 5}));
		System.out.println(test.has23(new int[] {4, 3}));
		System.out.println(test.has23(new int[] {4, 5}));
	}
	
	public boolean has23(int[] nums) {
		  if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) return true;
		  
		  return false;
		}
}
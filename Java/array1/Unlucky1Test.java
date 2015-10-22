package array1;

/*
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
 * Return true if the given array contains an unlucky 1 in the first 2 or last 2
 * positions in the array.
 * 
 * unlucky1({1, 3, 4, 5}) --> true
 * unlucky1({2, 1, 3, 4, 5}) --> true
 * unlucky1({1, 1, 1}) --> false
 */
public class Unlucky1Test {

	public static void main(String[] args) {
		System.out.println(unlucky1(new int[] {1, 3, 4, 5}));
		System.out.println(unlucky1(new int[] {2, 1, 3, 4, 5}));
		System.out.println(unlucky1(new int[] {1, 1, 1}));
	}
	
	public static boolean unlucky1(int[] nums) {
		  int length = nums.length;
		  
		  if (length < 2) return false;
		  if (length < 5) {
		    if (nums[0] == 1 && nums[1] == 3 ||
		    nums[length - 2] == 1 && nums[length - 1] == 3)  return true;
		  }
		  if (length >= 5) {
		    if (nums[0] == 1 && nums[1] == 3 ||
		    nums[1] == 1 && nums[2] == 3 ||
		    nums[length - 2] == 1 && nums[length - 1] == 3) return true;
		  }
		  return false;
		}
}
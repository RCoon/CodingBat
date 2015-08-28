	package array1;

/*
 * Given an int array length 2, return true if it does not contain a 2 or a 3.
 * 
 * no23({4, 5}) --> true
 * no23({4, 2}) --> true
 * no23({3, 5}) --> false
 */
public class No23Test {

	public static void main(String[] args) {
		No23Test test = new No23Test();
		System.out.println(test.no23(new int[] {4, 5}));
		System.out.println(test.no23(new int[] {4, 2}));
		System.out.println(test.no23(new int[] {3, 5}));
	}
	
	public boolean no23(int[] nums) {
	    return (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3);
	}
}
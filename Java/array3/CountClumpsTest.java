package array3;

/*
 * Say that a "clump" in an array is a series of 2 or more adjacent elements of
 * the same value. Return the number of clumps in the given array.
 * 
 * countClumps({1, 2, 2, 3, 4, 4}) --> 2
 * countClumps({1, 1, 2, 1, 1}) --> 2
 * countClumps({1, 1, 1, 1, 1}) --> 1
 */
public class CountClumpsTest {

	public static void main(String[] args) {
		CountClumpsTest test = new CountClumpsTest();
		System.out.println(test.countClumps(new int[] {1, 2, 2, 3, 4, 4}));
		System.out.println(test.countClumps(new int[] {1, 1, 2, 1, 1}));
		System.out.println(test.countClumps(new int[] {1, 1, 1, 1, 1}));
	}
	
	public int countClumps(int[] nums) {
	    int totalClumps = 0;
	    
	    for (int i = 0; i < nums.length; i++) {
	        boolean clump = false;
	        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
	            clump = true;
	            i++;
	        }   
	        if (clump) {
	            totalClumps++;
	            clump = false;
	        }
	    }
	    return totalClumps;
	}
}
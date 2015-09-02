package array1;

import java.util.*;

/*
 * Given an int array length 3, if there is a 2 in the array immediately
 * followed by a 3, set the 3 element to 0. Return the changed array.
 * 
 * fix23({1, 2, 3}) --> {1, 2, 0}
 * fix23({2, 3, 5}) --> {2, 0, 5}
 * fix23({1, 2, 1}) --> {1, 2, 1}
 */
public class Fix23Test {

	public static void main(String[] args) {
		Fix23Test test = new Fix23Test();
		System.out.println(Arrays.toString(test.fix23(new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(test.fix23(new int[] {2, 3, 5})));
		System.out.println(Arrays.toString(test.fix23(new int[] {1, 2, 1})));
	}
	
	public int[] fix23(int[] nums) {
		  if (nums[0] == 2 && nums[1] == 3) {
		    nums[1] = 0;
		    return nums;
		  } else if (nums[1] == 2 && nums[2] == 3) {
		    nums[2] = 0;
		    return nums;
		  } else {
		    return nums;
		  }
		}
}
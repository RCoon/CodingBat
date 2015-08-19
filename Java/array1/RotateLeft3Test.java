package array1;

import java.util.Arrays;

/*
 * Given an array of ints length 3, return an array with the elements
 * "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 * 
 * rotateLeft3({1, 2, 3}) --> {2, 3, 1}
 * rotateLeft3({5, 11, 9}) --> {11, 9, 5}
 * rotateLeft3({7, 0, 0}) --> {0, 0, 7}
 */
public class RotateLeft3Test {

	public static void main(String[] args) {
		RotateLeft3Test test = new RotateLeft3Test();
		System.out.println(Arrays.toString(
			test.rotateLeft3(new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(
						test.rotateLeft3(new int[] {5, 11, 9})));
		System.out.println(Arrays.toString(
						test.rotateLeft3(new int[] {7, 0, 0})));
	}
	
	public int[] rotateLeft3(int[] nums) {
	    int temp = 0;
		  
		temp = nums[0];
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		  
		return nums;
	}
}
package array1;

import java.util.Arrays;

/*
 * Given an array of ints length 3, return a new array with the elements in
 * reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 * 
 * reverse3({1, 2, 3}) --> {3, 2, 1}
 * reverse3({5, 11, 9}) --> {9, 11, 5}
 * reverse3({7, 0, 0}) --> {0, 0, 7}
 */
public class Reverse3Test {

	public static void main(String[] args) {
		Reverse3Test test = new Reverse3Test();
		System.out.println(Arrays.toString(
			test.reverse3(new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(
			test.reverse3(new int[] {5, 11, 9})));
		System.out.println(Arrays.toString(
			test.reverse3(new int[] {7, 0, 0})));
	}
	
	public int[] reverse3(int[] nums) {
		  int temp = 0;
		  temp = nums[0];
		  nums[0] = nums[2];		  
		  nums[2] = temp;		  
		  return nums;
		}
}
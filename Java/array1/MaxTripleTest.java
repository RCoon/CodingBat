package array1;

import java.util.Arrays;

/*
 * Given an array of ints of odd length, look at the first, last, and 
 * middle values in the array and return the largest. The array length
 * will be a least 1.
 * 
 * maxTriple({1, 2, 3}) → 3
 * maxTriple({1, 5, 3}) → 5
 * maxTriple({5, 2, 3}) → 5
 */
public class MaxTripleTest {

	public static void main(String[] args) {
		MaxTripleTest test = new MaxTripleTest();
		System.out.println(Arrays.toString(
			test.maxTriple(new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(
			test.maxTriple(new int[] {1, 5, 3})));
		System.out.println(Arrays.toString(
			test.maxTriple(new int[] {5, 2, 3})));
	}
	
  public int maxTriple(int[] nums) {
    if (nums.length == 1) return nums[0];
  
    int first = nums[0];
    int middle = nums[nums.length / 2];
    int last = nums[nums.length - 1];
  
    if (first >= middle && first >= last) return first;
  
    if (middle > first && middle > last) return middle;
  
    return last;
  }
}

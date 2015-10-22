package array1;

import java.util.Arrays;

/*
 * Given an int array of any length, return a new array of its first 2 elements.
 * If the array is smaller than length 2, use whatever elements are present.
 * 
 * frontPiece({1, 2, 3}) --> {1, 2}
 * frontPiece({1, 2}) --> {1, 2}
 * frontPiece({1}) --> {1}
 */
public class FrontPieceTest {

	public static void main(String[] args) {
		
		FrontPieceTest test = new FrontPieceTest();
		System.out.println(Arrays.toString(test.frontPiece(new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(test.frontPiece(new int[] {1, 2})));
		System.out.println(Arrays.toString(test.frontPiece(new int[] {1})));
	}
	
	public int[] frontPiece(int[] nums) {
		  if (nums.length == 1) {
		    int[] smArray = new int[1];
		    smArray[0] = nums[0];
		    return smArray;
		  }
		  
		  if (nums.length == 0) {
		    int[] emptyArray = new int[0];
		    return emptyArray;
		  }
		  
		  int[] array = new int[2];
		  array[0] = nums[0];
		  array[1] = nums[1];
		  return array;
		}
}
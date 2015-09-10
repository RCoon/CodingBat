package array1;

import java.util.Arrays;

/*
 * Given 2 int arrays, each length 2, return a new array length 4 containing all
 * their elements.
 * 
 * plusTwo({1, 2}, {3, 4}) --> {1, 2, 3, 4}
 * plusTwo({4, 4}, {2, 2}) --> {4, 4, 2, 2}
 * plusTwo({9, 2}, {3, 4}) --> {9, 2, 3, 4}
 */
public class PlusTwoTest {

    public static void main(String[] args) {
		PlusTwoTest test = new PlusTwoTest();
		System.out.println(Arrays.toString(
			test.plusTwo(new int[] {1, 2}, new int[] {3, 4})));
		System.out.println(Arrays.toString(
			test.plusTwo(new int[] {4, 4}, new int[] {2, 2})));
		System.out.println(Arrays.toString(
			test.plusTwo(new int[] {9, 2}, new int[] {3, 4})));
	}
	
	public int[] plusTwo(int[] a, int[] b) {
		  int[] array = new int[4];
		  
		  array[0] = a[0];
		  array[1] = a[1];
		  array[2] = b[0];
		  array[3] = b[1];
		  
		  return array;
		}
}
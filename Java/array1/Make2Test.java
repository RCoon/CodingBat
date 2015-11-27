package array1;

import java.util.Arrays;

public class Make2Test {

public static void main(String[] args) {
		
		Make2Test test = new Make2Test();
		System.out.println(Arrays.toString(test.make2(new int[] {4, 5}, new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(test.make2(new int[] {4}, new int[] {1, 2, 3})));
		System.out.println(Arrays.toString(test.make2(new int[] {}, new int[] {1, 2})));
	}
	
	public int[] make2(int[] a, int[] b) {
		  int[] array = new int[2];
		  
		  if (a.length >= 2) {
		    array[0] = a[0];
		    array[1] = a[1];
		    return array;
		  } else if (a.length == 1) {
		    array[0] = a[0];
		    array[1] = b[0];
		    return array;
		  } else {
		    array[0] = b[0];
		    array[1] = b[1];
		    return array;
		  }
	}
}

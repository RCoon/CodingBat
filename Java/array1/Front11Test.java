package array1;

import java.util.Arrays;

public class Front11Test {

	public static void main(String[] args) {

		Front11Test test = new Front11Test();
		System.out.println(Arrays.toString(test.front11(new int[] { 1, 2, 3 },
						new int[] { 7, 8, 9 })));
		System.out.println(Arrays.toString(
						test.front11(new int[] { 1 }, new int[] { 2 })));
		System.out.println(Arrays.toString(
						test.front11(new int[] { 1, 7 }, new int[] {})));
	}
	
	public int[] front11(int[] a, int[] b) {
		
		if (a.length == 0 && b.length == 0)
			return new int[0];

		if (a.length == 0) {
			int[] array = new int[1];
			array[0] = b[0];
			return array;
		} else if (b.length == 0) {
			int[] array = new int[1];
			array[0] = a[0];
			return array;
		} else {
			int[] array = new int[2];
			array[0] = a[0];
			array[1] = b[0];
			return array;
		}
	}
}

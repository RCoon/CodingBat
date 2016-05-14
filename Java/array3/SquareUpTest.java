package array3;

import java.util.Arrays;

public class SquareUpTest {

	public static void main(String[] args) {

		SquareUpTest test = new SquareUpTest();
		System.out.println(Arrays.toString(test.squareUp(3)));
		System.out.println(Arrays.toString(test.squareUp(2)));
		System.out.println(Arrays.toString(test.squareUp(4)));
	}

	public int[] squareUp(int n) {
		// if (n == 0) return new int[] {};

		int[] result = new int[n * n];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				result[i * n - j] = j;
			}
		}
		return result;
	}
}

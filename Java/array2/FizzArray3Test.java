package array2;

import java.util.Arrays;

public class FizzArray3Test {

	public static void main(String[] args) {

		FizzArray3Test test = new FizzArray3Test();
		System.out.println(Arrays.toString(test.fizzArray3(5, 10)));
		System.out.println(Arrays.toString(test.fizzArray3(11, 18)));
		System.out.println(Arrays.toString(test.fizzArray3(1, 3)));
	}

	public int[] fizzArray3(int start, int end) {
		if (start == end)
			return new int[0];

		int[] array = new int[end - start];

		for (int i = 0; i < end - start; i++) {
			array[i] = start + i;
		}
		return array;
	}
}

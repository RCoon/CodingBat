package array2;

import java.util.Arrays;

public class FizzBuzzTest {

	public static void main(String[] args) {

		FizzBuzzTest test = new FizzBuzzTest();
		System.out.println(Arrays.toString(test.fizzBuzz(1, 6)));
		System.out.println(Arrays.toString(test.fizzBuzz(1, 8)));
		System.out.println(Arrays.toString(test.fizzBuzz(1, 11)));
	}

	public String[] fizzBuzz(int start, int end) {
		int length = end - start;

		String[] array = new String[length];

		for (int i = 0; i < array.length; i++) {
			if ((start + i) % 3 == 0 && (start + i) % 5 == 0) {
				array[i] = "FizzBuzz";
			} else if ((start + i) % 3 == 0) {
				array[i] = "Fizz";
			} else if ((start + i) % 5 == 0) {
				array[i] = "Buzz";
			} else {
				array[i] = String.valueOf(start + i);
			}
		}
		return array;
	}
}

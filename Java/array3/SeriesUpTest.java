package array3;

import java.util.Arrays;

public class SeriesUpTest {

	public static void main(String[] args) {

		SeriesUpTest test = new SeriesUpTest();
		System.out.println(Arrays.toString(test.seriesUp(3)));
		System.out.println(Arrays.toString(test.seriesUp(4)));
		System.out.println(Arrays.toString(test.seriesUp(2)));
	}

	public int[] seriesUp(int n) {
		int[] result = new int[n * (n + 1) / 2];
		int i = 0;
		for (int j = 1; j <= n; ++j)
			for (int k = 1; k <= j; ++k)
				result[i++] = k;
		return result;
	}
}

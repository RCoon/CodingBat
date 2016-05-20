package logic1;

public class SortaSumTest {

	public static void main(String[] args) {

		SortaSumTest test = new SortaSumTest();
		System.out.println(test.sortaSum(3, 4));
		System.out.println(test.sortaSum(9, 4));
		System.out.println(test.sortaSum(10, 11));
	}

	public int sortaSum(int a, int b) {
		int sum = a + b;

		if (sum >= 10 && sum <= 19) {
			return 20;
		} else {
			return sum;
		}
	}
}

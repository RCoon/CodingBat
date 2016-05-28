package logic1;

public class TeenSumTest {

	public static void main(String[] args) {

		TeenSumTest test = new TeenSumTest();
		System.out.println(test.teenSum(3, 4));
		System.out.println(test.teenSum(10, 13));
		System.out.println(test.teenSum(13, 2));
	}

	public int teenSum(int a, int b) {
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19)
			return 19;

		return a + b;
	}
}

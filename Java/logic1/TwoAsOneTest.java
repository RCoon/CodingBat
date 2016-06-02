package logic1;

public class TwoAsOneTest {

	public static void main(String[] args) {

		TwoAsOneTest test = new TwoAsOneTest();
		System.out.println(test.twoAsOne(1, 2, 3));
		System.out.println(test.twoAsOne(3, 1, 2));
		System.out.println(test.twoAsOne(3, 2, 2));
	}

	public boolean twoAsOne(int a, int b, int c) {
		return (a + b == c || b + c == a || a + c == b);
	}
}

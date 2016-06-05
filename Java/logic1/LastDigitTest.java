package logic1;

public class LastDigitTest {

	public static void main(String[] args) {

		LastDigitTest test = new LastDigitTest();
		System.out.println(test.lastDigit(23, 19, 13));
		System.out.println(test.lastDigit(23, 19, 12));
		System.out.println(test.lastDigit(23, 19, 3));
	}

	public boolean lastDigit(int a, int b, int c) {
		int rightA = a % 10;
		int rightB = b % 10;
		int rightC = c % 10;

		return (rightA == rightB || rightB == rightC || rightA == rightC);
	}
}

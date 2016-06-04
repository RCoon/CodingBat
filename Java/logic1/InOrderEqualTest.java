package logic1;

public class InOrderEqualTest {

	public static void main(String[] args) {

		InOrderEqualTest test = new InOrderEqualTest();
		System.out.println(test.inOrderEqual(2, 5, 11, false));
		System.out.println(test.inOrderEqual(5, 7, 6, false));
		System.out.println(test.inOrderEqual(5, 5, 7, true));
	}

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (equalOk && a <= b && b <= c)
			return true;

		if (a < b && b < c)
			return true;

		return false;
	}
}

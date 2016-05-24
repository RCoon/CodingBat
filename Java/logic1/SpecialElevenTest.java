package logic1;

public class SpecialElevenTest {

	public static void main(String[] args) {

		SpecialElevenTest test = new SpecialElevenTest();
		System.out.println(test.specialEleven(22));
		System.out.println(test.specialEleven(23));
		System.out.println(test.specialEleven(24));
	}

	public boolean specialEleven(int n) {
		return ((n % 11 == 0) || ((n - 1) % 11 == 0));
	}
}

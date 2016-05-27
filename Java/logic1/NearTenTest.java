package logic1;

public class NearTenTest {

	public static void main(String[] args) {

		NearTenTest test = new NearTenTest();
		System.out.println(test.nearTen(12));
		System.out.println(test.nearTen(17));
		System.out.println(test.nearTen(19));
	}

	public boolean nearTen(int num) {
		int remainder = num % 10;

		return (remainder <= 2 || remainder >= 8);
	}

}

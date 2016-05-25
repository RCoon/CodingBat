package logic1;

public class More20Test {

	public static void main(String[] args) {

		More20Test test = new More20Test();
		System.out.println(test.more20(20));
		System.out.println(test.more20(21));
		System.out.println(test.more20(22));
	}

	public boolean more20(int n) {
		int test = n % 20;

		if (test == 1 || test == 2)
			return true;

		return false;
	}

}

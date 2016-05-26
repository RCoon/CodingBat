package logic1;

public class Less20Test {

	public static void main(String[] args) {

		Less20Test test = new Less20Test();
		System.out.println(test.less20(18));
		System.out.println(test.less20(19));
		System.out.println(test.less20(20));
	}

	public boolean less20(int n) {
		int test1 = (n + 1) % 20;
		int test2 = (n + 2) % 20;

		if (test1 == 0 || test2 == 0)
			return true;

		return false;

	}
}

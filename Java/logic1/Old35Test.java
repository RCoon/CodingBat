package logic1;

public class Old35Test {

	public static void main(String[] args) {

		Old35Test test = new Old35Test();
		System.out.println(test.old35(3));
		System.out.println(test.old35(10));
		System.out.println(test.old35(15));
	}

	public boolean old35(int n) {
		int test3 = n % 3;
		int test5 = n % 5;

		if (test3 == 0 && test5 != 0 || test3 != 0 && test5 == 0)
			return true;

		return false;
	}
}

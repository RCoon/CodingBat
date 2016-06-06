package logic1;

public class LessBy10Test {

	public static void main(String[] args) {

		LessBy10Test test = new LessBy10Test();
		System.out.println(test.lessBy10(1, 7, 11));
		System.out.println(test.lessBy10(1, 7, 10));
		System.out.println(test.lessBy10(11, 1, 7));
	}

	public boolean lessBy10(int a, int b, int c) {
		int maxAB = Math.max(a, b);
		int max = Math.max(maxAB, c);

		int minAB = Math.min(a, b);
		int min = Math.min(minAB, c);

		return (min + 10 <= max);
	}
}

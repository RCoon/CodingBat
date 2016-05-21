package logic1;

public class Love6Test {

	public static void main(String[] args) {

		Love6Test test = new Love6Test();
		System.out.println(test.love6(6, 4));
		System.out.println(test.love6(4, 5));
		System.out.println(test.love6(1, 5));
	}

	public boolean love6(int a, int b) {
		int sum = a + b;
		int diff = Math.abs(a - b);

		return (a == 6 || b == 6 || sum == 6 || diff == 6);
	}
}

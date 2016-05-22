package logic1;

public class In1To10Test {

	public static void main(String[] args) {

		In1To10Test test = new In1To10Test();
		System.out.println(test.in1To10(5, false));
		System.out.println(test.in1To10(11, false));
		System.out.println(test.in1To10(11, true));
	}

	public boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode) {
			return (n <= 1 || n >= 10);
		}
		return (n >= 1 && n <= 10);
	}
}

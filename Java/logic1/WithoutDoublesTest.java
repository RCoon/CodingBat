package logic1;

public class WithoutDoublesTest {

	public static void main(String[] args) {

		WithoutDoublesTest test = new WithoutDoublesTest();
		System.out.println(test.withoutDoubles(2, 3, true));
		System.out.println(test.withoutDoubles(3, 3, true));
		System.out.println(test.withoutDoubles(3, 3, false));
	}

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (noDoubles) {
			if (die1 == die2) {
				if (die2 == 6) {
					die2 = 1;
				} else {
					die2++;
				}
			}
		}
		return die1 + die2;
	}
}

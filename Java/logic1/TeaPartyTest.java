package logic1;

public class TeaPartyTest {

	public static void main(String[] args) {

		TeaPartyTest test = new TeaPartyTest();
		System.out.println(test.teaParty(6, 8));
		System.out.println(test.teaParty(3, 8));
		System.out.println(test.teaParty(20, 6));
	}

	public int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5)
			return 0;

		if (tea > candy && candy * 2 <= tea)
			return 2;
		if (candy > tea && tea * 2 <= candy)
			return 2;

		return 1;
	}
}

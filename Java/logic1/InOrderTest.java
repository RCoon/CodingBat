package logic1;

public class InOrderTest {

	public static void main(String[] args) {
		
		InOrderTest test = new InOrderTest();
		System.out.println(test.inOrder(1, 2, 4, false));
		System.out.println(test.inOrder(1, 2, 1, false));
		System.out.println(test.inOrder(1, 1, 2, true));
	}

	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if (c > b) {
			if (bOk)
				return true;
			if (b > a)
				return true;
		}
		return false;
	}
}

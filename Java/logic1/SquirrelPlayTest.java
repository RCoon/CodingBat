package logic1;

public class SquirrelPlayTest {

	public static void main(String[] args) {

		SquirrelPlayTest test = new SquirrelPlayTest();
		System.out.println(test.squirrelPlay(70, false));
		System.out.println(test.squirrelPlay(95, false));
		System.out.println(test.squirrelPlay(95, true));
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		return ((isSummer && temp >= 60 && temp <= 100)
						|| (!isSummer && temp >= 60 && temp <= 90));
	}
}

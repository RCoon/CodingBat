package logic1;

public class CaughtSpeedingTest {

	public static void main(String[] args) {

		CaughtSpeedingTest test = new CaughtSpeedingTest();
		System.out.println(test.caughtSpeeding(60, false));
		System.out.println(test.caughtSpeeding(65, false));
		System.out.println(test.caughtSpeeding(65, true));
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday) {
			if (speed > 85) {
				return 2;
			} else if (speed > 65) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if (speed > 80) {
				return 2;
			} else if (speed > 60) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}

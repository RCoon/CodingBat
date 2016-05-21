package logic1;

public class AlarmClockTest {

	public static void main(String[] args) {

		AlarmClockTest test = new AlarmClockTest();
		System.out.println(test.alarmClock(1, false));
		System.out.println(test.alarmClock(5, false));
		System.out.println(test.alarmClock(0, false));
	}

	public String alarmClock(int day, boolean vacation) {
		if (vacation) {
			if (day >= 1 && day <= 5) {
				return "10:00";
			} else {
				return "off";
			}
		} else {
			if (day >= 1 && day <= 5) {
				return "7:00";
			} else {
				return "10:00";
			}
		}
	}
}

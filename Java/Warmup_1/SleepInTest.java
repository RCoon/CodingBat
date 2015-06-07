package Warmup_1;
/*
 *The parameter weekday is true if it is a weekday, and the parameter vacation
 *is true if we are on vacation. We sleep in if it is not a weekday or we're on
 *vacation. Return true if we sleep in.
 *
 * sleepIn(false, false) = true
 * sleepIn(true, false) = false
 * sleepIn(false, true) = true
 */

public class SleepInTest {

	public static void main(String[] args) {
		
		SleepInTest test = new SleepInTest();
		
		System.out.println(test.sleepIn(false, false));
		System.out.println(test.sleepIn(true, false));
		System.out.println(test.sleepIn(false, true));
		

	}
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		   return (!weekday || vacation);
	}

}

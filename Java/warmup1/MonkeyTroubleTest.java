package warmup1;

/*
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if
 * each is smiling. We are in trouble if they are both smiling or if neither of
 * 
 * monkeyTrouble(true, true) = true
 * monkeyTrouble(false, false) = true
 * monkeyTrouble(true, false) = false
 */

public class MonkeyTroubleTest {

	public static void main(String[] args) {
		MonkeyTroubleTest test = new MonkeyTroubleTest();
		System.out.println(test.monkeyTrouble(true, true));
		System.out.println(test.monkeyTrouble(false, false));
		System.out.println(test.monkeyTrouble(true, false));
	}
	
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  if (aSmile && bSmile) {
		      return true;
		  }
		  if (!aSmile && !bSmile) {
		      return true;
		  }
		  return false;
	}
}

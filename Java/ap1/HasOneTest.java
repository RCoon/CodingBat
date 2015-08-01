package ap1;

/*
 * Given a positive int n, return true if it contains a 1 digit.
 * Note: use % to get the rightmost digit, and / to discard the rightmost
 * digit.
 * 
 * hasOne(10) --> true
 * hasOne(22) --> false
 * hasOne(220) --> false
 */

public class HasOneTest {
    public static void main(String[] args) {
		HasOneTest test = new HasOneTest();
		System.out.println(test.hasOne(10));
		System.out.println(test.hasOne(22));
		System.out.println(test.hasOne(220));
	}
	
	public boolean hasOne(int n) {
	    int ones = n % 10;
	    if (ones != 1 && n / 10 == 0) {
	        return false;
	    } else if (ones == 1) {
	        return true;
	    } else {
	        return hasOne(n / 10);
	    }
	}
}
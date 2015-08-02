package ap1;

/*
 * We'll say that a positive int divides itself if every digit in the number
 * divides into the number evenly. So for example 128 divides itself since
 * 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide
 * into anything evenly, so no number with a 0 digit divides itself.
 * 
 * dividesSelf(128) --> true
 * dividesSelf(12) --> true
 * dividesSelf(120) --> false
 */

public class DividesSelfTest {
    public static void main(String[] args) {
		DividesSelfTest test = new DividesSelfTest();
		System.out.println(test.dividesSelf(128));
		System.out.println(test.dividesSelf(12));
		System.out.println(test.dividesSelf(120));
	}
	
    public boolean dividesSelf(int n) {
        int digits = n;
        
        while (digits / 10 != 0) {
            int rightmost = digits % 10;
            if (rightmost == 0 || n % rightmost != 0) {
                return false;
            }
            digits /= 10;
        }
        if (digits == 0 || n % digits != 0) {
            return false;
        } else {
            return true;
        }
    }
}
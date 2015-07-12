package recursion1;

/*
 * Given a string, compute recursively the number of times lowercase "hi"
 * appears in the string, however do not count "hi" that have an 'x'
 * immediately before them.
 * 
 * countHi2("ahixhi") --> 1
 * countHi2("ahibhi") --> 2
 * countHi2("xhixhi") --> 0
 */

public class CountHi2Test {
    public static void main(String[] args) {
		CountHi2Test test = new CountHi2Test();
		System.out.println(test.countHi2("ahixhi"));
		System.out.println(test.countHi2("ahibhi"));
		System.out.println(test.countHi2("xhixhi"));
	}
    
    public int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        } else if (str.charAt(0) == 'x' && str.charAt(1) == 'h') {
            return countHi2(str.substring(2));
        } else {
            if (str.substring(0, 2).equals("hi")) {
                return 1 + countHi2(str.substring(1));
            } else {
                return countHi2(str.substring(1));
            }
        } 
    }
}
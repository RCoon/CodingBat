package recursion1;

/*
 * Given a string and a non-empty substring sub, compute recursively the
 * number of times that sub appears in the string, without the sub strings
 * overlapping.
 * 
 * strCount("catcowcat", "cat") --> 2
 * strCount("catcowcat", "cow") --> 1
 * strCount("catcowcat", "dog") --> 0
 */

public class StrCountTest {
    public static void main(String[] args) {
		StrCountTest test = new StrCountTest();
		System.out.println(test.strCount("catcowcat", "cat"));
		System.out.println(test.strCount("catcowcat", "cow"));
		System.out.println(test.strCount("catcowcat", "dog"));
	}
    
    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        } else if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }
}
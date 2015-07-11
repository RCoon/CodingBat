package recursion1;

/*
 * Given a string, return recursively a "cleaned" string where adjacent
 * chars that are the same have been reduced to a single char. So "yyzzza"
 * yields "yza".
 * 
 * stringClean("yyzzza") --> "yza"
 * stringClean("abbbcdd") --> "abcd"
 * stringClean("Hello") --> "Helo"
 */

public class StringCleanTest {
    public static void main(String[] args) {
		StringCleanTest test = new StringCleanTest();
		System.out.println(test.stringClean("yyzzza"));
		System.out.println(test.stringClean("abbbcdd"));
		System.out.println(test.stringClean("Hello"));
	}
    
    public String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            if (str.charAt(0) == str.charAt(1)) {
                return stringClean(str.substring(1));
            } else {
                return str.charAt(0) + stringClean(str.substring(1));
            }
        }
    }
}
package recursion1;

/*
 * Given a string, compute recursively a new string where all the 'x' chars
 * have been removed.
 * 
 * noX("xaxb") --> "ab"
 * noX("abc") --> "abc"
 * noX("xx") --> ""
 */

public class NoXTest {
    public static void main(String[] args) {
		NoXTest test = new NoXTest();
		System.out.println(test.noX("xaxb"));
		System.out.println(test.noX("abc"));
		System.out.println(test.noX("xx"));
	}
    
    public String noX(String str) {
        if (str.indexOf('x') < 0) {
            return str;
        } else {
            int index = str.indexOf('x');
            if (index < str.length() - 1) {
                str = str.substring(0, index) + str.substring(index + 1);
                return noX(str);
            } else {
                str = str.substring(0, index);
                return noX(str);
            }
        }
    }
}
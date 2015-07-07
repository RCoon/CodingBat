package recursion1;

/*
 * Given a string, compute recursively a new string where all the lowercase
 * 'x' chars have been moved to the end of the string.
 * 
 * endX("xxre") --> "rexx"
 * endX("xxhixx") --> "hixxxx"
 * endX("xhixhix") --> "hihixxx"
 */

public class EndXTest {
    public static void main(String[] args) {
		EndXTest test = new EndXTest();
		System.out.println(test.endX("xxre"));
		System.out.println(test.endX("xxhixx"));
		System.out.println(test.endX("xhixhix"));
	}
    
    public String endX(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            if (str.charAt(0) == 'x') {
                return endX(str.substring(1)) + "x";
            } else {
                return str.charAt(0) + endX(str.substring(1));
            }
        }
    }
}
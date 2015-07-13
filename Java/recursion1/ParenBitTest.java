package recursion1;

/*
 * Given a string that contains a single pair of parenthesis, compute
 * recursively a new string made of only of the parenthesis and their
 * contents, so "xyz(abc)123" yields "(abc)".
 * 
 * parenBit("xyz(abc)123") --> "(abc)"
 * parenBit("x(hello)") --> "(hello)"
 * parenBit("(xy)1") --> "(xy)"
 */

public class ParenBitTest {
    public static void main(String[] args) {
		ParenBitTest test = new ParenBitTest();
		System.out.println(test.parenBit("xyz(abc)123"));
		System.out.println(test.parenBit("x(hello)"));
		System.out.println(test.parenBit("(xy)1"));
	}
    
    public String parenBit(String str) {
        if (str.charAt(0) == '(') {
            int endIndex = str.indexOf(')') + 1;
            return str.substring(0, endIndex);
        } else {
            return parenBit(str.substring(1));
        }
    }
}
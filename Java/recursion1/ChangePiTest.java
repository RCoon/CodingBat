package recursion1;

/*
 * Given a string, compute recursively (no loops) a new string where all
 * appearances of "pi" have been replaced by "3.14".
 * 
 * changePi("xpix") --> "x3.14x"
 * changePi("pipi") --> "3.143.14"
 * changePi("pip") --> "3.14p"
 */

public class ChangePiTest {
    public static void main(String[] args) {
		ChangePiTest test = new ChangePiTest();
		System.out.println(test.changePi("xpix"));
		System.out.println(test.changePi("pipi"));
		System.out.println(test.changePi("pip"));
	}
    
    public String changePi(String str) {
        if (str.indexOf("pi") < 0) {
            return str;
        } else {
            int index = str.indexOf("pi");
            if (index < str.length() - 2) {
                str = str.substring(0, index) + "3.14" 
                    + str.substring(index + 2);
                return changePi(str);
            } else {
                str = str.substring(0, index) + "3.14";
                return changePi(str);
            }
        }
    }
}
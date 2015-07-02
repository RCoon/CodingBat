package recursion1;

/*
 * Given a string, compute recursively (no loops) a new string where all the
 * lowercase 'x' chars have been changed to 'y' chars.
 * 
 * changeXY("codex") --> "codey"
 * changeXY("xxhixx") --> "yyhiyy"
 * changeXY("xhixhix") --> "yhiyhiy"
 */

public class ChangeXYTest {
    public static void main(String[] args) {
		ChangeXYTest test = new ChangeXYTest();
		System.out.println(test.changeXY("codex"));
		System.out.println(test.changeXY("xxhixx"));
		System.out.println(test.changeXY("xhixhix"));
	}
    
    public String changeXY(String str) {
        if (str.indexOf('x') < 0) {
            return str;
        } else {
            int index = str.indexOf('x');
            if (index < str.length() - 1) {
                str = str.substring(0, index) + 'y' + str.substring(index + 1);
                return changeXY(str);
            } else {
                str = str.substring(0, index) + 'y';
                return changeXY(str);
            }
        }
    }
}

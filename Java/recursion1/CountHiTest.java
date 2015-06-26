package recursion1;

/*
 * Given a string, compute recursively (no loops) the number of times
 * lowercase "hi" appears in the string. 
 * 
 * countHi("xxhixx") -> 1
 * countHi("xhixhix") -> 2
 * countHi("hi") -> 1
 */

public class CountHiTest {
    public static void main(String[] args) {
		CountHiTest test = new CountHiTest();
		System.out.println(test.countHi("xxhixx"));
		System.out.println(test.countHi("xhixhix"));
		System.out.println(test.countHi("hi"));
	}
    
    public int countHi(String str) {
        if (str.length() <= 1) {
            return 0;
        } else {
            if (str.substring(0, 2).equals("hi")) {
                return 1 + countHi(str.substring(1));
            } else {
                return countHi(str.substring(1));
            }
        }
    }
}
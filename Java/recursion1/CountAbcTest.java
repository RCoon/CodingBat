package recursion1;

/*
 * Count recursively the total number of "abc" and "aba" substrings that
 * appear in the given string.
 * 
 * countAbc("abc") --> 1
 * countAbc("abcxxabc") --> 2
 * countAbc("abaxxaba") --> 2
 */

public class CountAbcTest {
    public static void main(String[] args) {
		CountAbcTest test = new CountAbcTest();
		System.out.println(test.countAbc("abc"));
		System.out.println(test.countAbc("abcxxabc"));
		System.out.println(test.countAbc("abaxxaba"));
	}
    
    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        } else if (str.substring(0, 3).equals("abc") ||
            str.substring(0, 3).equals("aba")) {
            return 1 + countAbc(str.substring(1));
        } else {
            return countAbc(str.substring(1));
        }
    }
}
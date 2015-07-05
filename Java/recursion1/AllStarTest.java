package recursion1;

/*
 * Given a string, compute recursively a new string where all the adjacent
 * chars are now separated by a "*".
 * 
 * allStar("hello") --> "h*e*l*l*o"
 * allStar("abc") --> "a*b*c"
 * allStar("ab") --> "a*b"
 */

public class AllStarTest {
    public static void main(String[] args) {
		AllStarTest test = new AllStarTest();
		System.out.println(test.allStar("hello"));
		System.out.println(test.allStar("abc"));
		System.out.println(test.allStar("ab"));
	}
    
    public String allStar(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.charAt(0) + "*" + allStar(str.substring(1));
        }
    }
}
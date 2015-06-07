package warmup2;

/*
 * Given a string and a non-negative int n, return a larger string that is n
 * copies of the original string.
 * 
 * stringTimes("Hi", 2) = "HiHi"
 * stringTimes("Hi", 3) = "HiHiHi"
 * stringTimes("Hi", 1) = "Hi"
 */

public class StringTimes {

	public static void main(String[] args) {
        StringTimes test = new StringTimes();
        System.out.println(test.stringTimes("Hi", 2));
        System.out.println(test.stringTimes("Hi", 3));
        System.out.println(test.stringTimes("Hi", 1));
	}
	
	public String stringTimes(String str, int n) {
		  String result = "";
		  
		  for (int i = 0; i < n; i++) {
		      result += str;
		  }
		  
		  return result;
	}
}

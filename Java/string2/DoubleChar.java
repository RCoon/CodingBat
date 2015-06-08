package string2;

/*
 * Given a string, return a string where for every char in the original, 
 * there are two chars.
 * 
 * doubleChar("The") -> "TThhee"
 * doubleChar("AAbb") -> "AAAAbbbb"
 * doubleChar("Hi-There") -> "HHii--TThheerree"
 */

public class DoubleChar {
	
	public static void main(String[] args) {
		DoubleChar test = new DoubleChar();
		System.out.println(test.doubleChar("The"));
		System.out.println(test.doubleChar("AAbb"));
		System.out.println(test.doubleChar("Hi-There"));
	}
	
	public String doubleChar(String str) {
		  String result = "";
		  
		  for (int i = 0; i < str.length(); i++) {
		      result = result + str.charAt(i) + str.charAt(i);
		  }
		  return result;
	}

}
package string3;

/*
 * Given a string, count the number of words ending in 'y' or 'z' -- so the
 * 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" 
 * (not case sensitive). We'll say that a y or z is at the end of a word if 
 * there is not an alphabetic letter immediately following it.
 * 
 * countYZ("fez day") --> 2
 * countYZ("day fez") --> 2
 * countYZ("day fyyyz") --> 2
 */

import java.util.*;

public class CountYZ {
	
	public static void main(String[] args) {
		CountYZ test = new CountYZ();
		System.out.println(test.countYZ("fez day"));
		System.out.println(test.countYZ("day fez"));
		System.out.println(test.countYZ("day fyyz"));
	}
	
	public int countYZ(String str) {
		  String newStr = "";
		  
		  for (int i = 0; i < str.length(); i++) {
		      if (Character.isLetter(str.charAt(i))) {
		          newStr += str.charAt(i);
		      } else {
		          newStr += " ";
		      }
		  }
		  
		  StringTokenizer st = new StringTokenizer(newStr);
		  int numWords = st.countTokens();
		  int count = 0;
		  for (int i = 0; i < numWords; i++) {
		      String token = (st.nextToken()).toLowerCase();
		      int length = token.length();
		      char last = token.charAt(length - 1);
		      if (last == 'y' || last == 'z') count++;
		  }
		  return count;
	}
}

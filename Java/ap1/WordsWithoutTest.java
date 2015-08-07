package ap1;

import java.util.Arrays;

/*
 * Given an array of strings, return a new array without the strings that
 * are equal to the target string. One approach is to count the occurrences
 * of the target string, make a new array of the correct length, and then
 * copy over the correct strings.
 * 
 * wordsWithout({"a", "b", "c", "a"}, "a") --> {"b", "c"}
 * wordsWithout({"a", "b", "c", "a"}, "b") --> {"a", "c", "a"}
 * wordsWithout({"a", "b", "c", "a"}, "c") --> {"a", "b", "a"}
 */

public class WordsWithoutTest {
    public static void main(String[] args) {
		WordsWithoutTest test = new WordsWithoutTest();
		System.out.println(Arrays.toString(test.wordsWithout(
						   new String[] {"a", "b", "c", "a"}, "a")));
		System.out.println(Arrays.toString(test.wordsWithout(
						   new String[] {"a", "b", "c", "a"}, "b")));
		System.out.println(Arrays.toString(test.wordsWithout(
						   new String[] {"a", "b", "c", "a"}, "c")));
	}
    
    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                count++;
            }
        }
        String[] newArray = new String[count];
        int index = 0;
        for (int j = 0; j < words.length; j++) {
            if (!words[j].equals(target)) {
            	newArray[index] = words[j];
                index++;
            }
        }
        return newArray;
    }
}
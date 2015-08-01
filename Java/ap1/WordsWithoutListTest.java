package ap1;

import java.util.*;

/*
 * Given an array of strings, return a new List (e.g. an ArrayList) where
 * all the strings of the given length are omitted. See wordsWithout() below
 * which is more difficult because it uses arrays.
 * 
 * wordsWithoutList({"a", "bb", "b", "ccc"}, 1) --> {"bb", "ccc"}
 * wordsWithoutList({"a", "bb", "b", "ccc"}, 3) --> {"a", "bb", "b"}
 * wordsWithoutList({"a", "bb", "b", "ccc"}, 4) --> {"a", "bb", "b", "ccc"}
 */

public class WordsWithoutListTest {
    public static void main(String[] args) {
		WordsWithoutListTest test = new WordsWithoutListTest();
		System.out.println(test.wordsWithoutList(
						   new String[] {"a", "bb", "b", "ccc"}, 1));
		System.out.println(test.wordsWithoutList(
						   new String[] {"a", "bb", "b", "ccc"}, 3));
		System.out.println(test.wordsWithoutList(
						   new String[] {"a", "bb", "b", "ccc"}, 4));
	}
	
	public List<String> wordsWithoutList(String[] words, int len) {
	    ArrayList<String> newWords = new ArrayList<String>();
	    
	    for (int i = 0; i < words.length; i++) {
	        if (words[i].length() != len) {
	            newWords.add(words[i]);
	        }
	    }
	    return newWords;
	}
}

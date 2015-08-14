package ap1;

import java.util.Arrays;

/*
 * Start with two arrays of strings, A and B, each with its elements in
 * alphabetical order and without duplicates. Return a new array containing
 * the first N elements from the two arrays. The result array should be in
 * alphabetical order and without duplicates. A and B will both have a
 * length which is N or more. The best "linear" solution makes a single
 * pass over A and B, taking advantage of the fact that they are in
 * alphabetical order, copying elements directly to the new array.
 * 
 * mergeTwo({"a", "c", "z"}, {"b", "f", "z"}, 3) --> {"a", "b", "c"}
 * mergeTwo({"a", "c", "z"}, {"c", "f", "z"}, 3) --> {"a", "c", "f"}
 * mergeTwo({"f", "g", "z"}, {"c", "f", "g"}, 3) --< {"c", "f", "g"}
 */

public class MergeTwoTest {
    public static void main(String[] args) {
		MergeTwoTest test = new MergeTwoTest();
		System.out.println(Arrays.toString(test.mergeTwo(
						   new String[] {"a", "c", "z"},
						   new String[] {"b", "f", "z"}, 3)));
		System.out.println(Arrays.toString(test.mergeTwo(
						   new String[] {"a", "c", "z"},
						   new String[] {"c", "f", "z"}, 3)));
		System.out.println(Arrays.toString(test.mergeTwo(
						   new String[] {"f", "g", "z"},
						   new String[] {"c", "f", "g"}, 3)));
	}
    
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] merged = new String[n];
        int aIndex = 0;
        int bIndex = 0;
        int compare;
        
        for (int i = 0; i < n; i++) {
            compare = a[aIndex].compareTo(b[bIndex]);
            if (compare <= 0) {
                merged[i] = a[aIndex++];
                if (compare == 0) bIndex++;
            } else {
                merged[i] = b[bIndex++];
            }            
        }
        return merged;
    }
}
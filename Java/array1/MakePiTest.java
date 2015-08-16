package array1;

import java.util.Arrays;

/*
 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
 * 
 * makePi() --> {3, 1, 4}
 */
public class MakePiTest {
    
	public static void main(String[] args) {
		MakePiTest test = new MakePiTest();
		System.out.println(Arrays.toString(test.makePi()));
	}
	
	public int[] makePi() {
		return new int[] {3, 1, 4};
	}
}
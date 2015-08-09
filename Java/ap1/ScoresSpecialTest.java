package ap1;

/*
 * Given two arrays, A and B, of non-negative int scores. A "special" score
 * is one which is a multiple of 10, such as 40 or 90. Return the sum of
 * largest special score in A and the largest special score in B. To
 * practice decomposition, write a separate helper method which finds
 * the largest special score in an array. Write your helper method after
 * your scoresSpecial() method in the JavaBat text area.
 * 
 * scoresSpecial({12, 10, 4}, {2, 20, 30}) --> 40
 * scoresSpecial({20, 10, 4}, {2, 20, 10}) --> 40
 * scoresSpecial({12, 11, 4}, {2, 20, 31}) --> 20
 */

public class ScoresSpecialTest {
    public static void main(String[] args) {
		ScoresSpecialTest test = new ScoresSpecialTest();
		System.out.println(test.scoresSpecial(new int[] {12, 10, 4},
		    new int[] {2, 20, 30}));
		System.out.println(test.scoresSpecial(new int[] {20, 10, 4},
					    new int[] {2, 20, 10}));
		System.out.println(test.scoresSpecial(new int[] {12, 11, 4},
					    new int[] {2, 20, 31}));
	}
	
	public int scoresSpecial(int[] a, int[] b) {
	    return largestSpecial(a) + largestSpecial(b);
	}

	public int largestSpecial(int[] array) {
	    int largest = 0;
	    for (int num : array) {
	        if (num % 10 == 0 && num > largest) {
	            largest = num;
	        }
	    }
	    return largest;    
	}
}
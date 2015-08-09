package ap1;

/*
 * We have an array of heights, representing the altitude along a walking
 * trail. Given start/end indexes into the array, return the sum of the
 * changes for a walk beginning at the start index and ending at the end
 * index. For example, with the heights {5, 3, 6, 7, 2} and start=2,
 * end=4 yields a sum of 1 + 5 = 6. The start end end index will both
 * be valid indexes into the array with start <= end.
 * 
 * sumHeights({5, 3, 6, 7, 2}, 2, 4) --> 6
 * sumHeights({5, 3, 6, 7, 2}, 0, 1) --> 2
 * sumHeights({5, 3, 6, 7, 2}, 0, 4) --> 11
 */

public class SumHeightsTest {
    public static void main(String[] args) {
		SumHeightsTest test = new SumHeightsTest();
		System.out.println(test.sumHeights(new int[] {5, 3, 6, 7, 2}, 2, 4));
		System.out.println(test.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 1));
		System.out.println(test.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 4));
	}
	
	public int sumHeights(int[] heights, int start, int end) {
	    int altChange = 0;
	    int index = start;
	    int diff;
	    
	    while (index < end) {
	        diff = Math.abs(heights[index] - heights[index + 1]);
	        altChange += diff;
	        index++;
	    }
	    return altChange;
	}
}
package array3;

/*
 * Given two arrays of ints sorted in increasing order, outer and inner, 
 * return true if all of the numbers in inner appear in outer. The best 
 * solution makes only a single "linear" pass of both arrays, taking advantage
 * of the fact that both arrays are already in sorted order.
 * 
 * linearIn({1, 2, 4, 6}, {2, 4}) -> true
 * linearIn({1, 2, 4, 6}, {2, 3, 4}) -> false
 * linearIn({1, 2, 4, 4, 6}, {2, 4}) -> true
 */

public class LinearIn {

	public static void main(String[] args) {
		LinearIn test = new LinearIn();
		System.out.println(test.linearIn(new int[] {1, 2, 4, 6}, 
										 new int[] {2, 4}));
		System.out.println(test.linearIn(new int[] {1, 2, 4, 6},
										 new int[] {2, 3, 4}));
		System.out.println(test.linearIn(new int[] {1, 2, 4, 4, 6},
										 new int[] {2, 4}));
	}
	
	public boolean linearIn(int[] outer, int[] inner) {
	    if (inner.length == 0) return true;
	    
	    for (int i = 0, j = 0; j < outer.length; j++) {
	        if (inner[i] == outer[j] && i+1 < inner.length) {
	            i++;
	        } else if (inner[i] == outer[j] && i+1 == inner.length) {
	            return true;
	        }
	    }
	    return false;
	}
}
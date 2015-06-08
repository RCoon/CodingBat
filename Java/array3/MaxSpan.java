package array3;

/*
 * Consider the leftmost and righmost appearances of some value in an array. 
 * We'll say that the "span" is the number of elements between the two 
 * inclusive. A single value has a span of 1. Returns the largest span found 
 * in the given array. (Efficiency is not a priority.) 
 * 
 * maxSpan({1, 2, 1, 1, 3}) -> 4
 * maxSpan({1, 4, 2, 1, 4, 1, 4}) -> 6
 * maxSpan({1, 4, 2, 1, 4, 4, 4}) -> 6
 */

public class MaxSpan {
	
	public static void main(String[] args) {
		MaxSpan test = new MaxSpan();
		System.out.println(test.maxSpan(new int[] {1, 2, 1, 1, 3}));
		System.out.println(test.maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4}));
		System.out.println(test.maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4}));
		
	}
	
	public int maxSpan(int[] nums) {
		  int length = nums.length;
		  int maxSpan = 0;
		  
		  for (int i = 0; i < length; i++) {
		      int value = nums[i];
		      int span = 0;
		      for (int j = length - 1; j >= 0; j--) {
		          if (nums[j] == value) {
		              if ((j - i) + 1 > span) span = j - i + 1;
		          }
		      }
		      if (span > maxSpan) maxSpan = span;
		  }
		  return maxSpan;
	}
}
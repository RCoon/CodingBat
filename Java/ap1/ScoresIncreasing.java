package ap1;

/*
 * Given an array of scores, return true if each score is equal or greater 
 * than the one before. The array will be length 2 or more.
 * 
 * scoresIncreasing({1, 3, 4}) -> true
 * scoresIncreasing({1, 3, 2}) -> false
 * scoresIncreasing({1, 1, 4}) -> true
 */

public class ScoresIncreasing {
	
	public static void main(String[] args) {
		ScoresIncreasing test = new ScoresIncreasing();
		System.out.println(test.scoresIncreasing(new int[] {1, 3, 4}));
		System.out.println(test.scoresIncreasing(new int[] {1, 3, 2}));
		System.out.println(test.scoresIncreasing(new int[] {1, 1, 4}));
	}
	
	public boolean scoresIncreasing(int[] scores) {
		  int score = scores[0];
		  for (int i = 1; i < scores.length; i++) {
		      if (scores[i] < score) return false;
		      score = scores[i];    
		  }
		  return true;
	}

}

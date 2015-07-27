package ap1;

/*
 * Given an array of scores sorted in increasing order, return true if the
 * array contains 3 adjacent scores that differ from each other by at most 2,
 * such as with {3, 4, 5} or {3, 5, 5}.
 * 
 * scoresClump({3, 4, 5}) --> true
 * scoresClump({3, 4, 6}) --> false
 * scoresClump({1, 3, 5, 5}) --> true
 */

public class ScoresClumpTest {
    public static void main(String[] args) {
		ScoresClumpTest test = new ScoresClumpTest();
		System.out.println(test.scoresClump(new int[] {3, 4, 5}));
		System.out.println(test.scoresClump(new int[] {3, 4, 6}));
		System.out.println(test.scoresClump(new int[] {1, 3, 5, 5}));
	}
    
    public boolean scoresClump(int[] scores) {
        for (int i = 2; i < scores.length; i++) {
            if (Math.abs(scores[i] - scores[i - 1]) <= 2
                && Math.abs(scores[i] - scores[i - 2]) <= 2) return true;
        }
        return false;
    }
}
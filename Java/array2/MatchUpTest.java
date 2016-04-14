package array2;

public class MatchUpTest {

	public static void main(String[] args) {

		MatchUpTest test = new MatchUpTest();
		System.out.println(test.matchUp(new int[] { 1, 2, 3 },
						new int[] { 2, 3, 10 }));
		System.out.println(test.matchUp(new int[] { 1, 2, 3 },
						new int[] { 2, 3, 5 }));
		System.out.println(test.matchUp(new int[] { 1, 2, 3 },
						new int[] { 2, 3, 3 }));
	}

	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;

		for (int i = 0; i < nums1.length; i++) {
			if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i])
				count++;
		}
		return count;
	}
}

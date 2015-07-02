package recursion1;

/* We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
 * (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have
 * 3 ears, because they each have a raised foot. Recursively return the number
 * of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
 *
 * bunnyEars2(0) --> 0
 * bunnyEars2(1) --> 2
 * bunnyEars2(2) --> 5
 */

class BunnyEars2 {

    public static void main(String[] args) {

	BunnyEars2 test = new BunnyEars();
	System.out.println(test.bunnyEars2(0));
	System.out.println(test.bunnyEars2(1));
	System.out.println(test.bunnyEars2(2));
    }

    public int bunnyEars2(int bunnies) {
	if (bunnies == 0) {
	    return 0;
	} else if (bunnies % 2 == 0) {
	    return bunnyEars2(bunnies - 1) + 3;
	} else {
	    return bunnyEars2(bunnies - 1) + 2;
    }
}

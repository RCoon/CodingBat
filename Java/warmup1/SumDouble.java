package warmup1;

/*
 * Given two int values, return their sum. Unless the two values are the same,
 * then return double their sum.
 * 
 * sumDouble(1, 2) = 3
 * sumDouble(3, 2) = 5
 * sumDouble(2, 2) = 8
 */
public class SumDouble {

	public static void main(String[] args) {
		SumDouble test = new SumDouble();
		System.out.println(test.sumDouble(1, 2));
		System.out.println(test.sumDouble(3, 2));
		System.out.println(test.sumDouble(2, 2));
	}
	
	public int sumDouble(int a, int b) {
		  int sum = a + b;
		  
		  // Double it if a and b are the same
		  if (a == b) {
		      sum = sum * 2;
		  }
		  
		  return sum;
	}
}

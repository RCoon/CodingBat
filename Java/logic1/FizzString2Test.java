package logic1;

public class FizzString2Test {

	public static void main(String[] args) {

		FizzString2Test test = new FizzString2Test();
		System.out.println(test.fizzString2(1));
		System.out.println(test.fizzString2(2));
		System.out.println(test.fizzString2(3));
	}

	public String fizzString2(int n) {
		boolean divBy3 = n % 3 == 0;
		boolean divBy5 = n % 5 == 0;

		if (divBy3 && divBy5)
			return "FizzBuzz!";

		if (divBy3)
			return "Fizz!";

		if (divBy5)
			return "Buzz!";

		return n + "!";
	}
}

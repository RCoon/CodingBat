package logic1;

public class FizzStringTest {

	public static void main(String[] args) {

		FizzStringTest test = new FizzStringTest();
		System.out.println(test.fizzString("fig"));
		System.out.println(test.fizzString("dib"));
		System.out.println(test.fizzString("fib"));
	}

	public String fizzString(String str) {
		if (str.charAt(0) == 'f') {
			if (str.charAt(str.length() - 1) == 'b')
				return "FizzBuzz";
			return "Fizz";
		}
		if (str.charAt(str.length() - 1) == 'b')
			return "Buzz";

		return str;
	}
}

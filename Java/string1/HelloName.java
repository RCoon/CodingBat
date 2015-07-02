package string1;

/*
 * Given a string name, e.g. "Bob", return a greeting of the form
 * "Hello Bob!".
 * 
 * helloName("Bob") --> "Hello Bob!"
 * helloName("Alice") --> "Hello Alice!"
 * helloName("X") --> "Hello X!"
 */

public class HelloName {

	public static void main(String[] args) {
		HelloName test = new HelloName();
		System.out.println(test.helloName("Bob"));
		System.out.println(test.helloName("Alice"));
		System.out.println(test.helloName("X"));
	}
	
	public String helloName(String name) {
		  return "Hello " + name + "!";
	}

}

package ap1;

/*
 * Start with two arrays of strings, a and b, each in alphabetical order,
 * possibly with duplicates. Return the count of the number of strings which
 * appear in both arrays. The best "linear" solution makes a single pass
 * over both arrays, taking advantage of the fact that they are in
 * alphabetical order.
 * 
 * commonTwo({"a", "c", "x"}, {"b", "c", "d", "x"}) --> 2
 * commonTwo({"a", "c", "x"}, {"a", "b", "c", "x", "z"}) --> 3
 * commonTwo({"a", "b", "c"}, {"a", "b", "c"}) --> 3
 */

public class CommonTwoTest {
    public static void main(String[] args) {
		CommonTwoTest test = new CommonTwoTest();
		System.out.println(test.commonTwo(new String[] {"a", "c", "x"},
						   new String[] {"b", "c", "d", "x"}));
		System.out.println(test.commonTwo(new String[] {"a", "c", "x"},
						   new String[] {"a", "b", "c", "x", "z"}));
		System.out.println(test.commonTwo(new String[] {"a", "b", "c"},
						   new String[] {"a", "b", "c"}));
		
	}
    
    public int commonTwo(String[] a, String[] b) {
    	  int count = 0;
    	  String last = "";
    	  
    	  for (int i = 0; i < a.length; i++) {
    	      if (!a[i].equals(last)) {
    	          for (int j = 0; j < b.length; j++) {
    	              if (a[i].equals(b[j])) {
    	                  count++;
    	                  last = a[i];
    	                  break;
    	              }
    	          }
    	      }
    	  }
    	  return count;
    	}
}
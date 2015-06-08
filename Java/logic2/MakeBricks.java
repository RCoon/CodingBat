package logic2;

/*
 * We want to make a row of bricks that is goal inches long. We have a number 
 * of small bricks (1 inch each) and big bricks (5 inches each). Return true 
 * if it is possible to make the goal by choosing from the given bricks. This 
 * is a little harder than it looks and can be done without any loops.
 * 
 * makeBricks(3, 1, 8) -> true
 * makeBricks(3, 1, 9) -> false
 * makeBricks(3, 2, 10) -> true
 */

public class MakeBricks {
    
	public static void main(String[] args) {
		MakeBricks test = new MakeBricks();
		System.out.println(test.makeBricks(3, 1, 8));
		System.out.println(test.makeBricks(3, 1, 9));
		System.out.println(test.makeBricks(3, 2, 10));
	}
	
	public boolean makeBricks(int small, int big, int goal) {
		  if (goal <= small) return true;
		  
		  if (small == 0) {
		      if ((big * 5) % goal == 0) return true;
		  }
		  
		  if (big == 0) {
		      if (goal > small) return false;
		  }
		  
		  if (small % goal == 0) return true;
		  
		  if ((big * 5) % goal == 0) return true;
		  
		  if (big > goal) {
		      if (small < goal % 10) return false;
		  }
		  
		  if (goal < big * 5) {
		      if (((big * 5) % goal) > 5) {
		          int reqSmall = 5 - (((big * 5) % goal) - 5);
		      if (small >= reqSmall) return true;
		      } else {
		          int reqSmall = 5 - ((big * 5) % goal);
		          if (small >= reqSmall) return true;
		      }
		  }

		  if (goal > big * 5) {
		      if ((big * 5 + small) >= goal) return true;
		  }
		  return false;
	}
}
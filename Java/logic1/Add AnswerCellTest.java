package logic1;

public class AnswerCellTest {

	public static void main(String[] args) {

		AnswerCellTest test = new AnswerCellTest();
		System.out.println(test.answerCell(false, false, false));
		System.out.println(test.answerCell(false, false, true));
		System.out.println(test.answerCell(true, false, false));
	}

	public boolean answerCell(boolean isMorning, boolean isMom,
					boolean isAsleep) {
		if (isAsleep)
			return false;
		if (!isMorning)
			return true;

		if (isMorning) {
			if (isMom) {
				return true;
			} else {
				return false;
			}
		}

		return true;
	}

}

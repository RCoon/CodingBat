package logic1;

public class DateFashionTest {

	public static void main(String[] args) {

		DateFashionTest test = new DateFashionTest();
		System.out.println(test.dateFashion(5, 10));
		System.out.println(test.dateFashion(5, 2));
		System.out.println(test.dateFashion(5, 5));
	}

	public int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) {
			return 0;
		} else if (you >= 8 || date >= 8) {
			return 2;
		} else {
			return 1;
		}
	}
}

package numbers.program;

public class Sum {

	public static void main(String[] args) {
		int number = 123, sum = 0, reminder = 0;
		while (number != 0) {
			reminder = number % 10;
			sum = sum + reminder;
			number = number / 10;

		}
		System.out.println("sum of digits are "+sum);
	}

}

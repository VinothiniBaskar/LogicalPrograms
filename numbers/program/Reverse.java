package numbers.program;

public class Reverse {

	public static void main(String[] args) {
		int number = 151;
		int temp;
		temp = number;

		int reminder = 0, reverse = 0;
		while (number != 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println(reverse);
		
		if (temp==reverse) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");

		}
	}
	

}

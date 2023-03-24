package numbers.program;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 2 };
		int evenSum = 0, oddSum = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenSum = evenSum + a[i];
			} else {
				oddSum = oddSum + a[i];

			}
		}
		System.out.println("Even sum is :" + evenSum);
		System.out.println("Odd sum is :" + oddSum);

	}

}

package numbers.program;

public class Maximam {

	public static void main(String[] args) {
		int a[] = { 2, 4, 5, 8 };
		int large, small = 0;
		large = small = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			} else {
				small = a[i];
			}
		}
		System.out.println(large);
		System.out.println(small);

	}

}

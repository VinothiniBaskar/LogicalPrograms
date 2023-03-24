package array.programs;

public class LargeSmall {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int size=a.length;
		int large = 0, small = 0;
		large = small = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			} else if (a[i] < small) {
				small = a[i];
			}
		}
		System.out.println("large is "+large);
		System.out.println("small is "+small);
		System.out.println("2nd largest number is :"+a[size-2]);
	}

}

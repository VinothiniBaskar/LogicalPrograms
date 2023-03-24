package array.programs;

//import java.util.Arrays;

public class AcendingOrder {

	public static void main(String[] args) {
		int a[] = {7, 9, 8, 3, 2, 1 };
		int temp;
//		Arrays.sort(a);
//		
//		for (int i : a) {
//			System.out.println(i);
//		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("Acending order is :"+a[i]);
		}
	}
}
                                                                                                                                                                               
package array.programs;

public class InterSectionElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,5};
		int b[]= {3,5,4,2};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					System.out.println("Intersection of elements is :"+b[j]);
				}
			}
		}
	}

}

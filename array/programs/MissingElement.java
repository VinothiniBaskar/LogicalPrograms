package array.programs;

public class MissingElement {

	
	public static void main(String[] args) {
		int a[]= {1,2,4,6,8};
		int count=1;
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=i+count) {
				System.out.println("Element is"+(i+count));
				count++;
			}
		}

	}

}

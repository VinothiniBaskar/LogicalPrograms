package array.programs;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,1};
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
System.out.println(sum);
	}

}

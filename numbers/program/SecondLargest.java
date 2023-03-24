package numbers.program;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {2,4,5,10};
		int temp,size;
		size=a.length;
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j <size; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println("Second largest number is :"+a[size-2]);
	}

}

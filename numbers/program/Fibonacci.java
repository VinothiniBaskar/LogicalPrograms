package numbers.program;

public class Fibonacci {

	public static void main(String[] args) {
		int number=5;
		int a=0,b=1,sum=0;
		System.out.print(a+" "+b);
		
		for (int i = 2; i <=number; i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}

	}

}

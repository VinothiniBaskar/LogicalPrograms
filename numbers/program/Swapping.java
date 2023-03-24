package numbers.program;

public class Swapping {

	public static void main(String[] args) {
		int x = 10, y = 30, temp;
		System.out.println("Before swap:" +x );
		System.out.println("Before swap:" + y );
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swap:" +x  );
		System.out.println("After swap:" +y  );
		
		String a="vino";
		String b="vasu";
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swap:" + a);
		System.out.println("After swap:" +b );
	}

}

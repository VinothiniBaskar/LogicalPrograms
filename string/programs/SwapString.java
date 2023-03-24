package string.programs;

public class SwapString {

	public static void main(String[] args) {
		String a="Vinothini";
		String b="baskar";
		
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		
		a=a.substring(b.length());
		
		System.out.println("a is :"+a);
		System.out.println("b is :"+b);


	}

}

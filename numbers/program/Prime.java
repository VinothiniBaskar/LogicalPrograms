package numbers.program;

public class Prime {

	public static void main(String[] args) {
		int number=13;
		boolean bPrime=true;
		for (int i = 2; i < number-1; i++) {
			if (number%i==0) {
				System.out.println("Not prime");
				bPrime=false;
				break;
			}
			
		}
if (bPrime) {
	System.out.println(" prime");

}

	}

}

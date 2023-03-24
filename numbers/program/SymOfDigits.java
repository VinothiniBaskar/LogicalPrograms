package numbers.program;

public class SymOfDigits {

	public static void main(String[] args) {
		int number=1231;
		int sum=0,reminder;
		while (number!=0) {
			reminder=number%10;
			sum=sum+reminder;
			number=number/10;
		}
System.out.println(sum);
	}

}

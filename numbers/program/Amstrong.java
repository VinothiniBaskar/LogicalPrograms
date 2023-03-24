package numbers.program;

public class Amstrong {

	public static void main(String[] args) {
		
		//number =cube of that number
		
		int number=153,reminder=0,sum=0;
		int temp;
		temp=number;
		
		while (number!=0) {
			reminder=number%10;
			sum=sum+reminder*reminder*reminder;
			number=number/10;
		}
		if (temp==sum) {
			System.out.println("amstrong");
		}
		else {
			System.out.println("not amstrong");

		}

	}

}

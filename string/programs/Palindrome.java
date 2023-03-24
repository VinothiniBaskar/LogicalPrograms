package string.programs;

public class Palindrome {

	public static void main(String[] args) {
	    //declare a string
		String str="level";
		//declare a variable of type string 
		String revStr="";
		//declare a variable of type char
		char ch;
		//for loop
		for (int i = 0; i < str.length(); i++) {
			ch=str.charAt(i);
			revStr=ch+revStr;
		}
		
		if (str.equals(revStr)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println(" not Palindrome");

		}

	}

}

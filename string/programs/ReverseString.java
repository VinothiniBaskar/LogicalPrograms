package string.programs;

public class ReverseString {

	public static void main(String[] args) {
		// declare a original string
		String str = "my india";
		// declare a variable with empty value
		String revStr = "";
		// declare a variable of type char
		char ch;

		//declare a for loop
		for (int i = 0; i < str.length(); i++) {
            //for every iteration take the single char and to strore in ch 
			ch = str.charAt(i);
			//concat the current ch value and revStr,store it to revStr
			revStr = ch + revStr;

		}
		System.out.println("Reversed String is :" + revStr);
	}

}

package string.programs;

public class CountWords {

	public static void main(String[] args) {
		String str="Welcome java";
		int count=1;
		System.out.println(str.length());

		for (int i = 0; i < str.length()-1; i++) {
			if ((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				count++;
			}
		}
System.out.println(count);
 	}

}
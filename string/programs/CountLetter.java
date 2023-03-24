package string.programs;

public class CountLetter {

	public static void main(String[] args) {
		String str = "vino queen";
		int count=1;
		System.out.println(str.length());
		for (int i = 0; i < str.length()-1;i++) {
			if (str.charAt(i)!=' '){
				count++;
			}

		}
		System.out.println(count);
	}

}

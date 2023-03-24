package string.programs;

public class VowelConsonant {

	public static void main(String[] args) {
		String str = "vinothini";
		char[] ch = str.toCharArray();
		int vowelCount = 0, consonantCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				vowelCount++;

			} else {
				consonantCount++;
			}
		}
		System.out.println(vowelCount);  
		System.out.println(consonantCount);
	}

}

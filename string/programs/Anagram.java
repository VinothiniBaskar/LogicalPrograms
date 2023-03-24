package string.programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// declare a strings
		String str1 = "sneak";
		String str2 = "snake";
		// convert to charArray
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		// sort the strings
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		// declare a boolean
		boolean banagram = true;

		for (int i = 0; i < ch2.length; i++) {
			if (ch1[i] != ch2[i]) {
				System.out.println("Not a anagram");
				banagram = false;
				break;
			}
		}
		if (banagram) {
			System.out.println("anagram");
		}

	}

}

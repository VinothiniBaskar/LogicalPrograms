package string.programs;

import java.util.HashMap;

public class NumberOfOccurence {

	public static void main(String[] args) {
		// declare a string
		String str = "vinothini";
		// declare char variable
		char[] ch = str.toCharArray();
		// declare a hashmap
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		// for loop
		for (char c : ch) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);

			}

		}
		System.out.println(hmap);
	}

}

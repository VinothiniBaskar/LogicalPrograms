package string.programs;

import java.util.HashMap;

public class TwoStrings {

	public static void main(String[] args) {
		String str1="vinothini";
		String str2="vasanth";
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();

		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		HashMap<Character,Integer> hmap1=new HashMap<Character,Integer>();
		
		for (char c : ch1) {
			if (!hmap.containsKey(c)) {
				hmap.put(c, 1);
			}
		}
		for (char c1 : ch2) {
			if (hmap.containsKey(c1)) {
				hmap1.put(c1, 1);
			}
		}
		System.out.println(hmap1);
	}

}

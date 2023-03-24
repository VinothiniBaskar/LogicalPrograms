package string.programs;

public class NonRepeating {

	public static void main(String[] args) {
		String str="vviio";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i),str.indexOf(str.charAt(i))+1)==-1) {
				System.out.println(str.charAt(i));
			}
		}

	}

}

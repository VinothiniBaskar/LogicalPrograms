package string.programs;

public class SpecialCharacter {

	public static void main(String[] args) {
		String str = "vino@%$";
		String result = str.replaceAll("[^a-zA-Z]", " ");
		System.out.println(result);
		
		String str2="vino13";
		String result1=str2.replaceAll("\\d", "");
		System.out.println(result1);
		
		
		String str3="vinothini";
		String result3=str3.replace("i", "");
		System.out.println(result3);
		
		int beforeCount=str3.length();
		int afterCount=result3.length();
		
		int count=beforeCount-afterCount;
		System.out.println(count);

	}

}

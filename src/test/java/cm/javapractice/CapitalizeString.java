package cm.javapractice;

public class CapitalizeString {

	public static void main(String[] args) {
		CapitalizeStringConvert("sandeep kumar dalei");
		CapitalizeStringConvert("sandeep");
	}
	
	public static String CapitalizeStringConvert(String word) {
		String result = "";
		String[] words = word.split("\\s");
		
		for (String wordArt : words) {
			String firststLetter = wordArt.substring(0, 1).toUpperCase();
			String restLetters = wordArt.substring(1);
			result = result + firststLetter + restLetters + " "; 
		}
		
		System.out.println(result.trim());
		return result.trim();
	}

}

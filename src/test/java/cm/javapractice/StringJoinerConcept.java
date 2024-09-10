package cm.javapractice;

import java.util.StringJoiner;

public class StringJoinerConcept {

	public static void main(String[] args) {
		String name1 = "Atali";
		String name2 = "Bhaskara";
		String name3 = "Sura";
		
		String join = String.join(",", name1,name2,name3);
		
		System.out.println(join);
		
		StringJoiner stringJoiner = new StringJoiner("|", "(", ")");
		
		stringJoiner.add(name1).add(name2).add(name3);
		
		System.out.println(stringJoiner.toString());
	}

}

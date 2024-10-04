package com.javapractice2;

public class CountOccurancesInaString {

	public static void main(String[] args) {
		String word = "abinashmadhuraPendiGuduPRSAllahamdulillahyabarkadunU";
		long count = word.chars().filter(e -> (char)e == 'a').count();
		System.out.println("The count is : " +count);
		
		long count2 = word.chars().filter(e -> (char)e == 'l' || (char)e == 'a').count();
		
		System.out.println("The count combining all : "+ count2);
		
		//count the number of vowels in a string
		long countVowels = word.chars().filter(e -> (char)e == 'a' || (char)e == 'e' || (char)e == 'i' || (char)e == 'o' || (char)e == 'u'
				|| (char)e == 'A' || (char)e == 'E' || (char)e == 'I' || (char)e == 'O' || (char)e == 'U').count();
		
		System.out.println("The number of vowels : " + countVowels);
		
	}

}

package com.javapractice2;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

public class CountVowelsInAString {

	public static void main(String[] args) {
		String str = "AnimalPlanetCartoonNW";
		
		IntPredicate vowel = new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				if(value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' ||
						value == 'A' || value == 'E' || value == 'I' || value == 'O' || value == 'U') {
					return true;
				}else return false;
			}
		};
	
		long count = str.chars().filter(vowel).count();
		
		System.out.println("The number of vowels : " + count);
		
		String st = "CommonSense";
		int countIn = CharMatcher.anyOf("aeiouAEIOU").countIn(st);
		System.out.println("The number of vowels : " + countIn);
	}

}

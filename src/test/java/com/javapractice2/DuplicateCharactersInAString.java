package com.javapractice2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharactersInAString {

	public static void main(String[] args) {
		String word = "abinashsamalsarangi";
		char[] wordArray = word.toCharArray();
		HashMap<Character, Integer> wordMap = new HashMap<Character, Integer>();
		
		//Loop:
		for (char c : wordArray) {
			if(wordMap.containsKey(c)) {
				wordMap.put(c, wordMap.get(c)+1);
			}else {
				wordMap.put(c, 1);
			}
		}
		
		System.out.println(wordMap);
		
		Collection<Integer> values = wordMap.values();
		System.out.println(values);
		Set<Character> keySet = wordMap.keySet();
		
		System.out.println(keySet);
		
		for (Character character : keySet) {
			if(wordMap.get(character) > 1) {
				System.out.println("The duplicate character is : " +character+ " And the count is : " + wordMap.get(character));
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = wordMap.entrySet();
		
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println("The character is : "+entry.getKey()+" The values is : "+entry.getValue());
			}
		}
	}

}

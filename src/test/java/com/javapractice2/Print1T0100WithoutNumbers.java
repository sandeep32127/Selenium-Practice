package com.javapractice2;

public class Print1T0100WithoutNumbers {

	public static void main(String[] args) {
		String s = "..........";
		String a = ".";
		
		for (int i = a.length(); i <= s.length()*s.length(); i++) {
			System.out.println(i);
		}
	}

}

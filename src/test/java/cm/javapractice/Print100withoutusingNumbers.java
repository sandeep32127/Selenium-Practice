package cm.javapractice;

import java.util.Iterator;

public class Print100withoutusingNumbers {

	public static void main(String[] args) {
		int one = 'A' / 'A';
		String s = "..........";
		
		for (int i = one; i <= (s.length() * s.length()); i++) {
			System.out.println(i);;
		}

	}

}

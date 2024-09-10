package cm.javapractice;

import java.util.Arrays;

public class Print100withoutusingLoopNRecursion {

	public static void main(String[] args) {
		Object[] num = new Object[100];
		
		Arrays.fill(num, new Object() {
			int count =0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		
		System.out.println(Arrays.toString(num));
		
		int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(Arrays.toString(numArray));
	}

}

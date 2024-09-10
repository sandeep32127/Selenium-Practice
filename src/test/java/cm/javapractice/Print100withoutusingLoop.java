package cm.javapractice;

import java.util.stream.IntStream;

public class Print100withoutusingLoop {

	public static void main(String[] args) {
		//printNum(1);
		//printNum(5, 99);
		IntStream.range(1, 101).forEach(num -> System.out.println(num));
	}
	
	public static void printNum(int num) {
		
		if(num <= 100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	public static void printNum(int startNum, int endNum) {
		
		if(startNum <= endNum) {
			System.out.println(startNum);
			startNum++;
			printNum(startNum, endNum);
		}
	}
}

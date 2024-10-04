package com.javapractice2;

public class Print1To100WithoutLoop {

	public static void main(String[] args) {
		printRecursion(1);
		System.out.println("---------------");
		printRecursion(1, 200);
	}
	
	public static void printRecursion(int num) {
		if(num <= 100) {
			System.out.println(num);
			num++;
			printRecursion(num);
		}
	}
	
	public static void printRecursion(int num, int limit) {
		if(num <= limit) {
			System.out.println(num);
			num++;
			printRecursion(num,limit);
		}
	}

}

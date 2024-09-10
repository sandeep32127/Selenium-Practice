package com.java8;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> bo1 = (x1,x2) -> x1*x2;
		
		Integer num1 = bo1.apply(10, 20);
		
		System.out.println(num1);
		
		BinaryOperator<String> func2 = (x1,x2) -> x1+" "+x2;
		
		String str1 = func2.apply("Sandy", "Bitto");
		
		System.out.println(str1);
	}

}

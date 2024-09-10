package com.java8;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	public static void main(String[] args) {
		
		
		Function<String, Integer> func1 = x -> x.length();
		
		Integer length = func1.apply("Sandeep");
		System.out.println(length);
		
		//chaining function
		
		Function<Integer, Integer> func2 = x -> x * 10;
		
		Integer len2 = func1.andThen(func2).apply("Sandy");
		
		System.out.println(len2);
	}

}

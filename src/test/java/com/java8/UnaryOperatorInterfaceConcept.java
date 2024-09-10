package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		
		UnaryOperator<String> uo1 = x -> x+" "+ "sam";
		
		String name = uo1.apply("Bitto");
		
		System.out.println(name);
		
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("RD");
		nameList.add("reana");
		nameList.add("Abhi");
		
		nameList.replaceAll(w -> w+" Sanbdu");
		
		System.out.println(nameList);
	}

}

package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplierInterfaceConcept {

	public static void main(String[] args) {
		
		Consumer<String> con = x -> System.out.println("The value is : "+x);
		con.accept("Sandeep");
		
		List<Integer> numList = Arrays.asList(23,56,90,4,56,345,21,789,2,4);
		
		numList.forEach(x -> System.out.println(x));
		
		getText(() -> "Java");
		getText(() -> "Sandeep");
		getText(() -> "Sanyashi");
	}
	
	public static void getText(Supplier<String> func) {
		System.out.println(func.get().length());
	}

}

package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFindAny {

	public static void main(String[] args) {
		
		List<Customer> custList = Arrays.asList(new Customer("Pradeep", 23),
					  new Customer("Sam", 18),
					  new Customer("Bhainsi", 78),
					  new Customer("bitto", 34));
		
		Customer cust = custList.stream().filter(x -> x.getName().equalsIgnoreCase("Bitto"))
		.findAny()
		.orElse(null);
		
		System.out.println(cust.getName() + "  " + cust.getAge());
		
		
	}

}

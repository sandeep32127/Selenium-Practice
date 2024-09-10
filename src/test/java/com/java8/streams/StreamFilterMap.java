package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap {

	public static void main(String[] args) {
		
		List<Customer> custList = Arrays.asList(new Customer("Pradeep", 23),
				  new Customer("Sam", 18),
				  new Customer("Bhainsi", 78),
				  new Customer("bitto", 34));
		
		int age = custList.stream().filter(x -> x.getAge() == 78)
		.map(Customer::getAge)
		.findAny()
		.orElse(null);
		
		System.out.println(age);
		
		List<String> namesList = custList.stream().map(Customer::getName).collect(Collectors.toList());
		
		namesList.forEach(System.out::println);

	}

}

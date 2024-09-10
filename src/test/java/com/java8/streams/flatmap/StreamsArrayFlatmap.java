package com.java8.streams.flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsArrayFlatmap {

	public static void main(String[] args) {
		
		String[][] data = {
				{"a","b","c"},
				{"d","e","f"},
				{"g","h","i"}
				};
		
		Stream<String> filter = Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x -> !x.toString().equals("a"));
		
		filter.forEach(e -> System.out.println(e));


	}
}

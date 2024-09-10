package com.java8.infinitestreams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IterateGenerate {

	public static void main(String[] args) {
		
		List<Double> collect = IntStream.iterate(0, n -> n+2)
		.mapToObj(Double :: valueOf)
		.limit(10)
		.collect(Collectors.toList());
		
		System.out.println(collect);
		
		List<Integer> collect2 = Stream.generate(() -> (new Random()).nextInt(200))
		.limit(5)
		.collect(Collectors.toList());
		
		System.out.println(collect2);
	}

}

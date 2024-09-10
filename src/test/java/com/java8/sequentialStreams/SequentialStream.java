package com.java8.sequentialStreams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(3,3,5,7,9,0,3,56,67);
		
		stream.findFirst().ifPresent(System.out::println);
		
		Arrays.asList("a","r","w","e","y")
		.stream().findFirst().ifPresent(System.out::println);
		
		IntStream.range(0, 23).average().ifPresent(x -> System.out.println(x));
		
		Stream.of("a0","a1","a2","a3","a4")
		.map(s -> s.substring(1))
		.mapToInt(Integer::parseInt)
		.forEach(System.out::println);
		
		Stream.of(1.0,34.67,345.890,12.0,58.78)
		.map(Double::intValue)
		.map(s -> "a" + s)
		.forEach(System.out::println);
		
		Stream.iterate(0, n -> n+1).limit(20).forEach(x -> System.out.println(x));
		
		Stream.iterate(0, n -> n+1).filter(x -> x%2 != 0).limit(10).forEach(x -> System.out.println(x));
	}

}

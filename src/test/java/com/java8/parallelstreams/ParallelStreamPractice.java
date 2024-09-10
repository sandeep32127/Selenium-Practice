package com.java8.parallelstreams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamPractice {

	public static void main(String[] args) {

		Stream.iterate(0, n -> n+1)
		.parallel()
		.limit(50)
		.forEach(x -> System.out.println(x));

		System.out.println("-----------");

		Stream.of(3,3,5,7,9,0,3,56,67).parallel().forEach(x -> System.out.println(x));

		System.out.println("-----------");
		
		Arrays.asList("Mantu","Ram","Shyam","Ghansyam","Biswa","Ravan").parallelStream().forEach(System.out::println);
		
		System.out.println("-----------");
		
		IntStream.range(0, 101).parallel().forEach(System.out::println);

	}

}

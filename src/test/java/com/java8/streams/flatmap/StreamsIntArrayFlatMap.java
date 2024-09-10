package com.java8.streams.flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsIntArrayFlatMap {

	public static void main(String[] args) {
		int[] data = {2,5,76,678,90,2,56,446,50};
		
		Arrays.stream(data).forEach(x -> System.out.println(x));
		
		Stream<int[]> intStreamArray = Stream.of(data);
		
		intStreamArray.flatMapToInt(x -> Arrays.stream(x)).forEach(System.out::println);
		
		Stream.of(data).flatMapToInt(x -> Arrays.stream(x)).filter( x-> x>100).forEach(System.out::println);
	}

}

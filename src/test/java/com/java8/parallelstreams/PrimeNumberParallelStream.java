package com.java8.parallelstreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberParallelStream {

	public static void main(String[] args) {
				
		long t1,t2;
		
		t1 = System.currentTimeMillis();
				
		  long count = Stream.iterate(0, n -> n+1)
		  .parallel()
		  .limit(300000)
		  .filter(PrimeNumberParallelStream ::isPrime)
		  .peek(System.out::println)
		  .count();
		  
		t2 = System.currentTimeMillis();
		
		System.out.println("Time Taken : " + (t2 -t1) / 1000 + " seconds"); 
		
		System.out.println("Total number of prime numbers : "+ count);
	}
	
	public static boolean isPrime(int numb) {
		if(numb <= 1) return false;
		else if(numb == 2) return true;
		else {
			return !IntStream.range(2, numb).anyMatch(x -> numb % x == 0);
		}
	}
}
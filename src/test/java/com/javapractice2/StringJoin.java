package com.javapractice2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringJoin {

	public static void main(String[] args) {
		String[] arr = {"d","A","Somen","prs", "gudu","k","o"};
		
		String join = String.join(";", arr);
		System.out.println(join);
		
		String collect = Arrays.asList("d","A","Somen","prs", "gudu","k","o").stream().collect(Collectors.joining("||"));
		
		System.out.println(collect);
		
		String collect2 = Arrays.asList(1,56,900,657,2,3,8,60).stream().map(e -> String.valueOf(e)).collect(Collectors.joining("[]"));
		
		System.out.println(collect2);
		
		//IntStream.range(0, 100).filter(i -> i%2 == 0).forEach(System.out::println);
		
		System.out.println(stringJoining(",", arr));
		
		System.out.println(integerJoining("|", 1,678,9,877,4000,44,590,78,2,56,38));
	}
	
	public static String stringJoining(String separator, String... values ) {
		StringBuilder sb = new StringBuilder();
		//int end = 0;
		
		if(values != null) {
			for (String data : values) {
				sb.append(data);
				sb.append(separator);
			}
		}
		
		return sb.toString().substring(0, sb.length()-1);
	}
	
	public static String integerJoining(String separator, Integer... values ) {
		StringBuilder sb = new StringBuilder();
		//int end = 0;
		
		if(values != null) {
			for (Integer data : values) {
				sb.append(data);
				sb.append(separator);
			}
		}
		
		return sb.toString().substring(0, sb.length()-1);
	}

}

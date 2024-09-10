package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	public static void main(String[] args) {
		List<String> namesLst = Arrays.asList("Mantu","Ram","Shyam","Ghansyam","Biswa","Ravan");
		namesLst.forEach(x -> System.out.println(x));
		namesLst.forEach(System.out::println);
		
		System.out.println("___________________");
		
		List<String> filterLst = namesLst.stream().filter(x -> !x.equals("Ravan") && x.equals("Biswa")).collect(Collectors.toList());
		filterLst.forEach(System.out::println);
	}

}

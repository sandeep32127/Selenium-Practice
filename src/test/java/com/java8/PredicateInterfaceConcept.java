package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		
		Predicate<Integer> pr = x -> x>50;
		
		boolean test = pr.test(100);
		
		System.out.println(test);
		
		List<Integer> numList = Arrays.asList(23,56,90,4,56,345,21,789,2,4);
		
		List<Integer> numListCollect = numList.stream().filter(pr).collect(Collectors.toList());
		
		System.out.println(numListCollect);
		
		List<Integer> numListCollect1 = numList.stream().filter(x -> x>2 && x<50).collect(Collectors.toList());
		
		System.out.println(numListCollect1);
		
		List<String> nameList = Arrays.asList("par","sam","asdd","sad","parsd","gdha");
		Predicate<String> pr2 = x -> x.contains("s");
		
		List<String> nameListcollect = nameList.stream().filter(pr2.negate()).collect(Collectors.toList());
		
		System.out.println(nameListcollect);
	}

}

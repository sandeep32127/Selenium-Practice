package com.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateList {

	public static void main(String[] args) {
		List<String> namesLst = new ArrayList<String>();
		
		namesLst.add("Amitabh");
		namesLst.add("Sharukh");
		namesLst.add("Salman");
		namesLst.add("John");
		namesLst.add("Ajay");
		namesLst.add("Akshay");
		
		System.out.println("print using forEach Java8 concepts");
		
		namesLst.forEach(x -> {
			System.out.println(x);
		});
		
		System.out.println("Using Iterator-------------");
		
		Iterator<String> iterator = namesLst.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Using List Iterator------------");
		
		ListIterator<String> listIterator = namesLst.listIterator(namesLst.size());
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		System.out.println("Using Iterator and foreachRemaining Java8 Lambda");
		
		iterator = namesLst.iterator();
		iterator.forEachRemaining(x -> System.out.println(x));
		
		System.out.println("Using For Each loop");
		
		for (String names : namesLst) {
			System.out.println(names);
		}
		
		System.out.println("Method references-----------");
		
		namesLst.forEach(System.out :: println);
	}

}

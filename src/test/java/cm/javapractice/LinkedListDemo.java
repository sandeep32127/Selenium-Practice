package cm.javapractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> lstNames = new LinkedList<String>();
		int num = 0;

		lstNames.add("Pandu");
		lstNames.add("Gudu");
		lstNames.add("PRS");
		lstNames.add("Somen");
		lstNames.add("BG");
		lstNames.add("maikina");
		lstNames.add("Lalita");
		lstNames.add("BG");
		lstNames.add(null);
		lstNames.add("Pandu");
		lstNames.add("Gandu");


		System.out.println("__________________");

		/*
		 * for (String names : lstNames) { System.out.println(names); }
		 * 
		 * System.out.println("__________________");
		 * 
		 * while (num < lstNames.size()) { System.out.println(lstNames.get(num)); num++;
		 * }
		 * 
		 * System.out.println("__________________");
		 * 
		 * Iterator<String> iterator = lstNames.iterator(); while (iterator.hasNext()) {
		 * String name = iterator.next(); System.out.println(name);
		 * 
		 * }
		 * 
		 * 
		 * System.out.println("__________________");
		 * 
		 * ListIterator<String> listIterator = lstNames.listIterator(); while
		 * (listIterator.hasNext()) { System.out.println(listIterator.next()); }
		 * 
		 * System.out.println("__________________");
		 * 
		 * while (listIterator.hasPrevious()) {
		 * System.out.println(listIterator.previous());
		 * 
		 * }
		 */

		lstNames.addFirst("Suresh");
		lstNames.addLast("ramesh");

		for (String names : lstNames) { 
			System.out.println(names); 
		}
		
		/*
		 * System.out.println("__________________");
		 * 
		 * System.out.println("The first element removed : " + lstNames.remove());
		 * 
		 * System.out.println("The last element removed : " + lstNames.removeLast());
		 * 
		 * for (String names : lstNames) { System.out.println(names); }
		 */
		
		/*
		 * System.out.println("__________________");
		 * 
		 * System.out.println("removing the last occurance of Pandu : " +
		 * lstNames.removeLastOccurrence("Pandu"));
		 * 
		 * for (String names : lstNames) { System.out.println(names); }
		 */
		
		System.out.println("The first index of Pandu : "+ lstNames.indexOf("Pandu"));
		
		System.out.println("The last index of Pandu : "+ lstNames.lastIndexOf("Pandu"));
		
		System.out.println("__________________");
		
		lstNames.set(9, "Padia");
		
		for (String names : lstNames) { System.out.println(names); }
		
		List<String> subList = lstNames.subList(2, 7);
		
		System.out.println("__________________");
		
		for (String names : subList) { System.out.println(names); }
		
		System.out.println("__________________");
		
		Iterator<String> descendingIterator = lstNames.descendingIterator();
		
		while(descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}
		
		System.out.println("__________________");
		
		System.out.println("The element removed : " + lstNames.pop());
		
		for (String names : lstNames) { System.out.println(names); } 
		
		System.out.println("__________________");
		
		lstNames.push("Ravan");
		
		for (String names : lstNames) { System.out.println(names); } 
		
		System.out.println("__________________");
		
		System.out.println("The element removed : " +lstNames.poll());
		
		System.out.println("The first element removed : " + lstNames.pollFirst());
		
		for (String names : lstNames) { System.out.println(names); } 


		/*
		 * System.out.println("The first entry : " + lstNames.getFirst());
		 * System.out.println("The last name : " + lstNames.getLast());
		 */

	}

}

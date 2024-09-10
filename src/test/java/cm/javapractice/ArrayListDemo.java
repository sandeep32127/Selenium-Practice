package cm.javapractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> lstNames = new ArrayList<String>();

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
		
		ListIterator<String> listIterator = lstNames.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("__________________");
		
		String[] arrayNames = lstNames.toArray(new String[lstNames.size()]);
		
		/*
		 * for (Object object : arrayNames) { System.out.println((String) object); }
		 */
		
		for (String names : arrayNames) {
			System.out.println(names);
		}
		
		System.out.println("The index of BG : " + lstNames.indexOf("BG"));
		
		System.out.println("The last index of BG : " + lstNames.lastIndexOf("BG"));
		
		Object clone = lstNames.clone();
		
		System.out.println(clone);
		
		System.out.println("The String is : " + lstNames.toString());
	}

}

package cm.javapractice;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> htab = new Hashtable<Integer, String>();
		
		htab.put(23, "Sandy");
		htab.put(15, "Randy");
		htab.put(87, "Onto");
		htab.put(900, "Ram");
		htab.put(700, "Shyam");
		htab.put(8, "Tabko");
		
		Enumeration<Integer> keys = htab.keys();
		
		while(keys.hasMoreElements()) {
			Integer key = keys.nextElement();
			System.out.println("Keys : " + key + " Values : " + htab.get(key));
		}
		
		Enumeration<String> elements = htab.elements();
		
		while(elements.hasMoreElements()) {
			String value = elements.nextElement();
			System.out.println("The values are : " + value);
		}
		System.out.println(htab.contains("Shyam"));

	}

}

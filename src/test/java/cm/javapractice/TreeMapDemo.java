package cm.javapractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(34, "Hath");
		treeMap.put(56, "Soru");
		treeMap.put(890, "Nim");
		treeMap.put(23, "Zaink");
		treeMap.put(100, "Uoplo");
		treeMap.put(78, "Fartor");
		treeMap.put(44, "Abhi");

		Set<Entry<Integer, String>> entrySet = treeMap.entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("The keys : " +entry.getKey() + " The value is : " + entry.getValue());
		}

		System.out.println("-----------");

		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

		while(iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();

			System.out.println("The keys : " +next.getKey() + " The value is : " + next.getValue());
		}
		
		System.out.println("Sorted By Values -----------");
		
		Map<Integer, String> sortedTreemap = sortedTreemap(treeMap);
		
		for (Entry<Integer, String> entry : sortedTreemap.entrySet()) {
			
			System.out.println("The keys : " +entry.getKey() + " The value is : " + entry.getValue());
		}
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Map<Integer, String> sortedTreemap(Map<Integer, String> map) {

		List<Entry<Integer, String>> list = new LinkedList<Entry<Integer, String>>(map.entrySet());

		Collections.sort(list, new Comparator() {

			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Entry) (o2)).getValue()).
						compareTo(((Entry) (o1)).getValue());
			}
		});
		
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
		
		Iterator<Entry<Integer, String>> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			sortedMap.put(next.getKey(), next.getValue());
		}
		
		return sortedMap;
	}
}

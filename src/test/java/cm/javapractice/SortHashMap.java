package cm.javapractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {

		Map<Integer, String> hMap = new HashMap<Integer, String>();

		hMap.put(1,"Sandeep");
		hMap.put(98, "Somen");
		hMap.put(3, "Maikina");
		hMap.put(4, "Gudu");
		hMap.put(8790, "Lalita");
		hMap.put(298, "Susu");
		
		Map<Integer, String> hMapTree = new TreeMap<Integer, String>(hMap);
		
		System.out.println("The sorting using tree map -----");
		
		System.out.println(hMapTree);
		
		System.out.println("The sorting using comparator -----");
		
		@SuppressWarnings("unchecked")
		Map<Integer, String>  sortedMap = sortedMap(hMap);
		
		Set<Entry<Integer, String>> entrySet = sortedMap.entrySet();
		
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println("The key is : "+next.getKey() +" The value is :"+next.getValue() );
			
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Map sortedMap(Map map) {
		
		List list = new LinkedList(map.entrySet());
		
		Collections.sort(list, new Comparator() {

			public int compare(Object o1, Object o2) {
				return ((Comparable)((Map.Entry) (o2)).getValue()).
						compareTo(((Map.Entry) (o1
								
								)).getValue());
			}	
		});
		
		Map sortetMap = new LinkedHashMap();
		
		Iterator iterator = list.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			sortetMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortetMap;
	}
}

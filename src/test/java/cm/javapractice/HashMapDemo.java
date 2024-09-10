package cm.javapractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(1,"Sandeep");
		hMap.put(3, "maikina");
		hMap.put(4, "Gudu");
		hMap.put(98, "Somen");
		hMap.put(8790, "Lalita");
		hMap.put(null, "Susu");
		hMap.put(8798, null);
		
		System.out.println(hMap);
		
		Set<Entry<Integer, String>> entrySet = hMap.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("The key is : "+entry.getKey()+ " , The value is : " + entry.getValue() );
		}
		
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, String> etryIterator = iterator.next();
			System.out.println(etryIterator.getKey() + ":" + etryIterator.getValue());
		}
		
		//System.out.println("The removed element is : "+ hMap.remove(98));
		
		Collection<String> values = hMap.values();
		
		System.out.println(values);
		
		hMap.replace(null, "Gandu");
		
		System.out.println(hMap);
	}

}

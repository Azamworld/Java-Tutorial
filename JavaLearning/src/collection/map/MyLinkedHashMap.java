package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
/*
 * LinkedHashMap is subclass of HashMap
 * # Implements Map,Serializable, Cloneable.
 * # Duplicate key is not allowed.
 * # Duplicate value is allowed.
 * # Insertion Order is preserved.
 * # Initial default capacity is 16.
 * # Default load factor is 0.75.
 * 
 */
public class MyLinkedHashMap {
	private Map<String, String> mLinkedMap;
	
	private void insertElements() {
		mLinkedMap = new LinkedHashMap<String, String>();
		mLinkedMap.put("A", "Noman");
		mLinkedMap.put("B", "Noman");
		mLinkedMap.put("C", "Rehan");
		mLinkedMap.put("D", "Ghufran");
		mLinkedMap.put("E", "Anam");
		mLinkedMap.put("E", "Ariz");
		mLinkedMap.put("F", "Aliza");
	}
	
	private void printElements() {
		Iterator<Entry<String, String>> entry = mLinkedMap.entrySet().iterator();
		while (entry.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry2 = (Map.Entry<java.lang.String, java.lang.String>) entry
					.next();
			System.out.println(entry2);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedHashMap demo = new MyLinkedHashMap();
		demo.insertElements();
		demo.printElements();
	}

}

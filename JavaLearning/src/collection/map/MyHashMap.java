package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * HashMap is child of Map interface
 * # Implements Map, Serializable, Cloneable.
 * # Store values in key-pair.
 * # Duplicate key is not allowed.
 * # Duplicate value storing is allowed.
 * # Insertion order is not preserved.
 * # Default initial value is 16.
 * # Default load factor is 0.75.
 * # Allows one null key and any number of null values.
 * # Its all methods are non-synchronous.
 * # Its non thread safe.
 */

public class MyHashMap {
	private Map<String, String> mMap;
	
	private void insertElements() {
		mMap = new HashMap<String, String>();
		mMap.put("Key1", "A");
		mMap.put("Key1", "B");
		mMap.put("Key2", "C");
		mMap.put("Key3", "G");
		mMap.put("Key4", "D");
		mMap.put("Key5", "E");
		mMap.put("Key5", "E");
	}
	
	private void printElements() {
		Iterator<Entry<String, String>> iterator = mMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) iterator
					.next();
			System.out.println(entry);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap demo = new MyHashMap();
		demo.insertElements();
		demo.printElements();
	}

}

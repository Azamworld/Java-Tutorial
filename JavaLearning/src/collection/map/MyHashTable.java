package collection.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Hastable is child of Dictionary
 * # Implements Map,Serilizable, Cloneable.
 * # Duplicate value is allowed.
 * # Duplicate key is not allowed.
 * # Null value or key both are not allowed.
 * # Thread safe.
 * # Performance is slow.
 * # 
 */
public class MyHashTable {
private Map<String, String> mMap;
	
	private void insertElements() {
		mMap = new Hashtable<String, String>();
		mMap.put("Key1", "A");
		mMap.put("Key1", "B");
		mMap.put("Key2", "A");
		mMap.put("Key3", "G");
		mMap.put("Key4", "D");
		mMap.put("Key5", "E");
		mMap.put("Key6", "E");
		//mMap.put("Key9", null);
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
		MyHashTable demo = new MyHashTable();
		demo.insertElements();
		demo.printElements();
	}
}

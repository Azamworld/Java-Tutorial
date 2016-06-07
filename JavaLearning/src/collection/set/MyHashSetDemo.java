package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * HashSet is child of Set interface. 
 * # Unique value is stored. 
 * # Insertion is not preserved. 
 * # Implements Serializable, Cloneable etc.
 * # Initial capacity is 16.
 * # Load factor is 0.75.
 * 
 */
public class MyHashSetDemo {
	private Set<String> mSet;
	
	private void insertElements() {
		mSet = new HashSet<String>();
		mSet.add("List");
		mSet.add("List");
		mSet.add("Set");
		mSet.add("Map");
		mSet.add("Collection");
		mSet.add("Arrays");
	}
	
	private void printElements() {
		Iterator<String> iterator = mSet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
	}
	
	private void deleteElement() {
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashSetDemo demo = new MyHashSetDemo();
		demo.insertElements();
		demo.printElements();
	}

}

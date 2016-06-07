package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * LinkedHashSet is child of Set interface.
 * # Duplicate is not allowed.
 * # Insertion is preserved.
 * # Implements Serializable, Cloneable etc.
 * # Initial value is 16.
 * # Load factor is 0.75.
 */
public class MyLinkedHashSet {
	private Set<Integer> mSet;
	
	private void insertElements() {
		mSet = new LinkedHashSet<Integer>();
		mSet.add(1);
		mSet.add(2);
		mSet.add(3);
		mSet.add(3);
		mSet.add(4);
		mSet.add(5);
		mSet.add(6);
	}
	
	private void printElements() {
		Iterator<Integer> mIterator = mSet.iterator();
		while (mIterator.hasNext()) {
			Integer integer = (Integer) mIterator.next();
			System.out.println(integer);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedHashSet linkedHashSet = new MyLinkedHashSet();
		linkedHashSet.insertElements();
		linkedHashSet.printElements();
	}

}

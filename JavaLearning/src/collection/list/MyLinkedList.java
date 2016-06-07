package collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * LinkedList is child of List interface
 * implements Serializable, Cloneable etc.
 * 
 * # Duplicates are allowed.
 * # Insertion order is preserved.
 * # Heterogeneous data is allowed.
 * # Use underlying data structure is Doubly linked list
 * # Methods are asynchronous so not thread safe.
 * 
 * Best ---> When deletion from middle.
 * 
 * Worst ---> In traversal.
 */
public class MyLinkedList {
	private List<String> mList;
	
	private void myLinkedDemo() {
		mList = new LinkedList<String>();
		mList.add("A");
		mList.add("B");
		mList.add("C");
		mList.add("D");
		mList.add("E");
		
		System.out.println("Sizeis:" +mList.size());

		
		printAllElemnts();
		
	}
	
	private void printAllElemnts() {
		ListIterator<String> iterator = mList.listIterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
			if(string.equals("E")) iterator.add("F");
			
		}
		
		System.out.println("Sizeis:" +mList.size());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.myLinkedDemo();

		
	}

}

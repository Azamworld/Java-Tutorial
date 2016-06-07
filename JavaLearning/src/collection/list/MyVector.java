package collection.list;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/*
 * Vector is child of list interface
 *  implements  RandomAccess, Cloneable, Serializable
 * 
 * # Duplicates are allowed.
 * # Insertion order is preserved.
 * # Initial capacity is 10.
 * # Mostly methods are synchronized.
 * # Thread safe
 * # Only one thread can operate at one time so performance is slow due to wait long time for thread.
 * 
 * Best---> In traversal and Thread safe
 * 
 * Worst ---> Removal from middle.
 */
public class MyVector {
	private List<String> list;
	
	private void myVectorDemo() {
		list = new Vector<String>();
		list.add("Lucknow");
		list.add("Allhabad");
		list.add("Sultanpur");
		list.add("Ghorukhpur");
		
	}
	
	private void printElements() {
		Enumeration<String> enumeration = ((Vector<String>) list).elements();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(string);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVector myVector = new MyVector();
		myVector.myVectorDemo();
		myVector.printElements();

	}

}

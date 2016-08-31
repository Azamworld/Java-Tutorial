package collection.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ArrayList child of List interface and implements 
 * Serializable, Cloneable, RandomAccess etc.
 * 
 * # Duplicate is allowed.
 * # Insertion order is preserved.
 * # Heterogeneous data is allowed.
 * # Element traversal is to fast with RandomAccess.
 * # Initial size is 10.
 * # Size grows with ---> initialCapacity*1.5 + 1
 * # Uses underlying data structure (Growable).
 * # Methods are asynchronous so not thread - safe
 * # BUT multiple thread can operate so performance is high.
 * 
 * 
 * Best --> In traversal
 * 
 * Worst --> In element removal from middle.
 * 
 */

public class MyArrayListDemo  {
	private List<String> mList;
	
	private void listDemo(){
		mList = new ArrayList<String>();
		mList.add("Noman");
		mList.add("Android");
		mList.add("iOS");
		mList.add("Swift");
		
		System.out.println("List size is: " + mList.size());
		printAllEmelemnts();
		
	}
	
	private void printAllEmelemnts(){
			Iterator<String> iterator = mList.iterator();
			while (iterator.hasNext()) {
				String string = (String) iterator.next();
				System.out.println(string);
				if(string.equals("Android")) iterator.remove();
				
			}
			
			System.out.println("List size is: " + mList.size());

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyArrayListDemo().listDemo();
		//new MyArrayListDemo().printAllEmelemnts();

	}

}

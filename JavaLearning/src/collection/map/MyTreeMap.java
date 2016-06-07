package collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
/*
 * TreeMap child of SortedMap interface
 * # Implements Serializable, Cloneable etc.
 * # Duplicate value is allowed
 * # Duplicate key is not allowed.
 * # Insertion in natural sorting order of key.
 * # Null value is allowed.
 */
public class MyTreeMap {
	private Map<String, String> mapTree;
	
	private void insertElements() {
		mapTree = new TreeMap<String, String>();
		
		mapTree.put("KeyOne", "Android");
		mapTree.put("KeyTwo", "Swift");
		mapTree.put("KeyThree", "Java");
		mapTree.put("KeyFour", "Swift");
		mapTree.put("KeyOne", "Android Java");
		mapTree.put("KeySix", null);
		mapTree.put("KeySeven", null);
	    
		
	}
	
	private void printElements() {
		Iterator<Entry<String, String>> iterator = mapTree.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) iterator
					.next();
			System.out.println(entry);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTreeMap demo = new MyTreeMap();
		demo.insertElements();
		demo.printElements();

	}

}

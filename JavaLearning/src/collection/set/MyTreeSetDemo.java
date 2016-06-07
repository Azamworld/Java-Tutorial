package collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSetDemo {
	private Set<String> mSet;
	
	private void insertElements() {
		mSet = new TreeSet<String>();
		mSet.add("Rahman");
		mSet.add("Abullah");
		mSet.add("Razi");
		mSet.add("Rahman");
		mSet.add("Mustakeem");
		mSet.add("Zakiya");

	}
	
	private void printElements() {
		Iterator<String> iterator = mSet.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTreeSetDemo demo = new MyTreeSetDemo();
		demo.insertElements();
		demo.printElements();

	}

}

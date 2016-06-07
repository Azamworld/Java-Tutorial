package collection.list;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
	private Queue<String> mQueue; 
	
	private void insertElements() {
		mQueue = new PriorityQueue<String>();
		mQueue.add("A");
		mQueue.add("B");
		mQueue.add("B");
		mQueue.add("C");
		mQueue.add("D");
		mQueue.add("E");

	}
	
	private void printElements() {
		Iterator<String> iterator = mQueue.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
	}
	
	private void deleteElement() {
		mQueue.remove();
		System.out.println();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue myQueue = new MyQueue();
		myQueue.insertElements();
		myQueue.printElements();
		myQueue.deleteElement();
		myQueue.printElements();
		

	}

}

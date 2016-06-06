package collection;

import java.util.Iterator;
import java.util.Stack;

/*
 * Stack is Last in first out(LIFO)
 * # Duplicate is allowed
 * # Insertion is preserved
 * # Last in first out
 */
public class MyStackDemo {
	private Stack<String> stack;
	
	private void insertElements() {
		stack = new Stack<String>();
		stack.push("India");
		stack.push("India");
		stack.push("Pakistan");
		stack.push("Bhutan");
		stack.push("China");
		stack.push("Bangladesh");
	}
	
	private void printAllElements() {
		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
	
	private void deleteElement() {
		stack.pop();
	}
	
	private void topElements() {
		System.out.println("Top element is: "+stack.peek());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStackDemo demo = new MyStackDemo();
		demo.insertElements();
		demo.printAllElements();
		demo.deleteElement();
		demo.printAllElements();
		demo.topElements();

	}

}

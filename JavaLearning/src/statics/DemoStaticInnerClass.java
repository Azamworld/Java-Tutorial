package statics;

/*
 * Static inner class does not need to make object of outer class to call it.
 */
public class DemoStaticInnerClass {
	private String str = "Demo String";
	public DemoStaticInnerClass() {
		System.out.println("Hi i am super class constructor");
	}
	
	public static void main(String[] strings) {
		DemoStaticInnerClass.MyDemo name = new DemoStaticInnerClass.MyDemo();
		name.printMe();
	}
	
	private static class MyDemo {
		public void printMe() {
			System.out.println("Hi i am static inner class method.");
		}
	}
	
}

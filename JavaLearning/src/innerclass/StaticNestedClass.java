package innerclass;

/*
 * Static nested class created inside class.
 *  1: They can't access non static members of outer class
 *  2:  It can be accessed by outer class name.
 */
public class StaticNestedClass {
	private int outer = 90;
	
	static class Demo {
		int a = 80;
		 void printMe() {
			 System.out.println(a);
		 }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo dm = new StaticNestedClass.Demo();
		dm.printMe();
		
		StaticNestedClass.Demo demo = new StaticNestedClass.Demo();
		demo.printMe();
	}

}

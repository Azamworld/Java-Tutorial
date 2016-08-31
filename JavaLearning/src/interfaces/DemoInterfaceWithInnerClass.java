package interfaces;

public interface DemoInterfaceWithInnerClass {
	public void printMe();
	
	class MyDemo {
		public void myDemoMethod() {
			System.out.println("I am inner class in interface");
		}
	}
}

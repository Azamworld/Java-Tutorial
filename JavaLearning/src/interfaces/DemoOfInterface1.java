package interfaces;
import interfaces.DemoInterfaceWithInnerClass;

public class DemoOfInterface1 implements DemoInterfaceWithInnerClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoInterfaceWithInnerClass demo = new DemoOfInterface1();
		demo.printMe();
		DemoInterfaceWithInnerClass.MyDemo demo2 = new MyDemo();
		demo2.myDemoMethod();
	}

	@Override
	public void printMe() {
		// TODO Auto-generated method stub
		System.out.println("I am implemented method.");
		
	}


}

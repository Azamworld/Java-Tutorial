package interfaces;

public class Demo1 implements DemoInterfaceFields, DemoInterfaceBehavior{

	public void testing() {
		System.out.println(Demo1.a);
		System.out.println(Demo1.d);
		System.out.println(Demo1.e);
		System.out.println(Demo1.f);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 demo1 = new Demo1();
		demo1.testing();

	}

	@Override
	public void starting() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		
	}

}

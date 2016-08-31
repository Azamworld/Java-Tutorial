package initializer;

public class B extends A{
	
	
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("Child class constructor");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B();

	}

	{
		System.out.println("I am initializer");
	}
}

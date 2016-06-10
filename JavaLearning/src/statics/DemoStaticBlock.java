package statics;

public class DemoStaticBlock {
	private String str;
	
	/*
	 * Static block is called at class loading time
	 */
	static{
		System.out.println("Hi i am static block");
	}
	
	/*
	 * Empty initializer is only called at time object creation.
	 */
	{
		System.out.println("Hi i am empty initializer");
	}
	
	public DemoStaticBlock() {
		System.out.println("Hi i am constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoStaticBlock block = new DemoStaticBlock();

	}

}

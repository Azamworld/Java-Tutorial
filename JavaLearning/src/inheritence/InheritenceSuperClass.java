package inheritence;

public class InheritenceSuperClass {

	// Fields

	//Normal
	public int a = 90;
	private int b = 78;
	protected int c = 66;
	int d = 11;
	
/////////////////////////////////////////////////////////////////////
	
	//Static
	public static int s_a = 590;
	private static int s_b = 378;
	protected static int s_c = 266;
	static int s_d = 11;

	
//////////////////////////////////////////////////////////////////////
	
	//final
	public final int f_a = 690;
	private final int f_b = 478;
	protected final int f_c = 866;
	final int f_d = 11;


///////////////////////////////////////////////////////////////////////

	// Behavior

	//Normal
	public void runnig() {
		System.out.println("I am running at speed of 19km/hr");
	}

	private void sleeping() {
		System.out.println("I am sleeping");
	}

	protected void eating() {
		System.out.println("I am eating food");
	}
	
	void chatting(){
		System.out.println("Hi i am chatting with my friends.");
	}

/////////////////////////////////////////////////////////////////////////////
	
	//static
	public static void runnig1() {
		System.out.println("I am running1 at speed of 19km/hr");
	}

	private static void sleeping1() {
		System.out.println("I am sleeping1");
	}

	protected static void eating1() {
		System.out.println("I am eating food1");
	}

	static void chatting1(){
		System.out.println("Hi i am chatting1 with my friends.");
	}
	
/////////////////////////////////////////////////////////////////////////////////
	
	//final
	public final void runnig2() {
		System.out.println("I am running2 at speed of 19km/hr");
	}

	private final void sleeping2() {
		System.out.println("I am sleeping2");
	}

	protected final void eating2() {
		System.out.println("I am eating food2");
	}
	
	final void chatting2(){
		System.out.println("Hi i am chatting2 with my friends.");
	}

}

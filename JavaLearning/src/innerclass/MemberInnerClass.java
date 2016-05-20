package innerclass;

/**
 * 
 * @author noman
 * 
 * Member inner class outside method and inside class
 * Get access to outer class private method or data member.
 */
public class MemberInnerClass {
	private int a = 90;
	
	class InnerClass {
		private void innerMethod(){
			System.out.println(a);
		}
	}
	
	public static void main(String... args) {
		MemberInnerClass ob = new MemberInnerClass();
		InnerClass innerClass = ob.new InnerClass();
		innerClass.innerMethod();
	}

}

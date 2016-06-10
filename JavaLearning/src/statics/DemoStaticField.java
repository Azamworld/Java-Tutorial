package statics;

/*
 * Static members get allocated  memory when class loaded. So they do not require
 * object to invoke. They can be invoke with class name only. 
 */
public class DemoStaticField {
	private static String str = "Java static members";
	
	public static void main(String[] strings) {
		System.out.println(DemoStaticField.str);
	}
}

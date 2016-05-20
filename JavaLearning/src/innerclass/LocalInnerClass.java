package innerclass;

/*
 * A class is created inside method is called local inner class
 * It can only instantiated with methods only.
 */
public class LocalInnerClass {
	private int a = 90;
	
	private void display(){
		
		// Local variable can't be private, protect or default.    
		int u = 160;
		
		class LocalClass {
			void printMe(){
				System.out.println(a);
				System.out.println(u);

			}
		}
		
		new LocalClass().printMe();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		new LocalInnerClass().display();
	}

}

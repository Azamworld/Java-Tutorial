package innerclass;

public class AnonymousInnerClass {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person() {
			
			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("JavaInner Class");
			}
		};
		person.eat();
	}

}

abstract class Person {
	abstract void eat();
}

package innerclass;

public class AnonymousInnerClassInterfaceImplement {
	public static void main(String... args) {
		Duck duck = new Duck() {
			public void quack() {
				System.out.println("Quck Quck ...");
			}
		};
		
		duck.quack();
	}
}


interface Duck {
	void quack();
}
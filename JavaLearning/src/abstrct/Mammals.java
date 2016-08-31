package abstrct;

/*
 *  Abstraction is achieve through Abstract class. It does not give 100%.
 *  
 *  Abstract class have abstract methods and normal. Abstract methods does not have body
 *  
 *  Abstract can exist without abstract method.
 *  Abstract class object can not be created.
 *  Abstract class object created internally(When child class object is created). Not open to use.
 *  
 *  Abstract class can have constructor.
 */
public abstract class Mammals {
	
	public int a = 78;
	
	
	public abstract void running();
	//private abstract void sleeping();
	protected abstract void eating();
	abstract void drinking();
	
	public Mammals() {
		System.out.println("hi i m abstract class default constructor");
	}
	
	public Mammals(int a) {
		System.out.println("hi i m abstract class parametrized constructor");
	}
	
}

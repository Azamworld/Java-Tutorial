package inheritence;

public class ChildSecond extends Demo1 {
    
	public void printVars(){
		System.out.println(this);
		super.name();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildSecond childSecond = new ChildSecond();
		childSecond.printVars();

	}

}

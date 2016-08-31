package instanceofoperator;

public class Dog3 extends Animal {
	
	private void printMe(){
		System.out.println("Printing...");
	}
	
    public static void doo(Animal a) {
    	if(a instanceof Dog3){
    		Dog3 dog3 = (Dog3)a;
    		dog3.printMe();
    		
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Dog3 dog3 = new Animal(); Compile time error
		
		Animal animal = new Dog3();
		Dog3.doo(animal);

	}

}

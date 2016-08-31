package ploymorphism;

public class RunTimePolyMorPhism extends Draw{
	int radius = 45;
	int area = 78;
	
	public void draw() {
		System.out.println("Draw Circle");
	}
	
	public void run() {
		System.out.println("Horse running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Draw draw = new Draw();
		draw.draw();
		Draw draw2 = new RunTimePolyMorPhism();
		draw2.draw();
		draw2.run();
		

	}

}

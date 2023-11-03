package Assignment_3_1;

public class MAIN_Point {
	public static void main(String[] args) {
		
		System.out.println("---Paramaterized Constructor Gets Invoked---");
		Point p=new Point(2,3);
		
		System.out.println("---Display Function Gets Invoked---");
		p.display();
		
		System.out.println("---Getters Get Invoked---");
		System.out.println("x = "+p.getXCoordinate());
		System.out.println("y = "+p.getYCoordinate());
		
		System.out.println("---Setters Get Invoked---");
		p.setXCoordiante(4);
		p.setYCoordinate(5);
		
		p.display();
	} 
}

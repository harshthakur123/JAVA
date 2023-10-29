package Lab_6_1;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(int x, int y,double radius) {
		super(x, y);
		this.radius=radius;
		
	}


	public String toString() {
		return "Circle (radius) = "+radius+super.toString();
	}
	
	
	public double area() {
		return 3.14*radius*radius;
	}
}

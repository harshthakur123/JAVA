package Lab_6_1;

public class Square extends Shape {
	
	private double side;
	
	public Square(int x, int y,double side) {
		super(x, y);
		this.side=side;
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	@Override
	public String toString() {
		return "Square(side) = "+"  "+side+ super.toString();
	}





	public double area() {
		return side*side;
	}
}

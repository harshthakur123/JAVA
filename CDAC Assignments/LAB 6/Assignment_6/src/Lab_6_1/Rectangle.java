package Lab_6_1;

public class Rectangle extends Shape {
	private double a,b;
	
	public Rectangle(int x, int y ,int a ,int b) {
		super(x, y);
		this.a=a;
		this.b=b;
	}


	public String toString() {
		return "Rectangle(sides) =  ("+this.a+" , "+this.b+")" + super.toString() ;
	}
	
	
	public double area() {
		return a*b;
	}

}

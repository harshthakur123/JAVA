package Lab_6_1;

public abstract class Shape {
	
	private int x,y;
	
	public Shape(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public Shape()
	{
		x=10;y=20;
	}
	
	@Override
	public String toString()
	{
		return " , Elements of Shape : "+x+" "+y;
	}
	public abstract double area();
	
	
	
}

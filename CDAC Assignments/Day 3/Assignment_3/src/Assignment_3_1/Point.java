package Assignment_3_1;

public class Point {

	private int x;
	private int y;
	
	//Default Constructor
	Point()
	{
		x=5;
		y=10;
	}
	
	//Paramaterized Constructor
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	//Display Fucntion
	public void display()
	{
		System.out.println("Point = ("+x+","+y+")");
	}
	
	//Getters
	
	public int getXCoordinate()
	{
		return x;
	}
	
	public int getYCoordinate()
	{
		return y;
	}
	
	//Setters
	public void setXCoordiante(int x)
	{
		this.x=x;
		System.out.println("x = "+x);
	}
	public void setYCoordinate(int y)
	{
		this.y=y;
		System.out.println("y = "+y);
	}
}

package Q_1;
public class Point_2D {
	
	private int x;
	private int y;
	
	Point_2D(){
		
	};
	
	Point_2D(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
	
}

import java.util.Scanner;
import java.lang.Math;
public class Area {
	
	static Scanner sc=new Scanner(System.in);
	public static void circle()
	{
		double rad = 0,area;
		System.out.println("Area of Circle:");
		System.out.println("Enter radius:");
		if(sc.hasNextInt())
			rad=sc.nextInt();
		else
		{
			System.out.println("Enter a valid value!!!");
			
		}
		area=3.14*rad*rad;
		System.out.println("Area of circle = "+area);
	}
	
	public static void rectangle()
	{
		double len = 0,width = 0,area;
		System.out.println("Area of Rectangle:");
		System.out.println("Enter Length:");
		if(sc.hasNextInt())
			len=sc.nextInt();
		else
		{
			System.out.println("Enter a valid value!!!");
			
		}
		System.out.println("Enter Width:");
		if(sc.hasNextInt())
			width=sc.nextInt();
		else
		{
			System.out.println("Enter a valid value!!!");
			
		}
		area=len*width;
		System.out.println("Area of Rectangle = "+area);
	}
	
	public static void triangle()
	{
		double s1 = 0,s2 = 0,s3 = 0,s,area;
		System.out.println("Area of Triangle:");
		System.out.println("Enter Side 1:");
		if(sc.hasNextInt())
			s1=sc.nextInt();
		else
		{
			System.out.println("Enter a valid value!!!");
			
		}
		System.out.println("Enter Side 2:");
		if(sc.hasNextInt())
			s2=sc.nextInt();
		else
		{
			System.out.println("Enter a valid value!!!");
			
		}
		System.out.println("Enter Side 3:");
		if(sc.hasNextInt())
			s3=sc.nextInt();
		else
		{
			System.out.println("Enter a valid value!!!");
			
		}
		s=(s1+s2+s3)/2;
		area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("Area of Triangle = "+area);
	}

	
	
}

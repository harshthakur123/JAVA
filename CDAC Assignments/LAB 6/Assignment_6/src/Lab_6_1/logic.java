package Lab_6_1;

import java.util.Scanner;

public class logic {

	static Scanner sc = new Scanner(System.in);
	int ch = 0;
	static int index = 0;
//	Shape s=new Shape(); cannot create instance/object of abstract class

	static Shape[] s = new Shape[5];
	
	public static void show() {
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				System.out.println((i + 1) + "  " + s[i]);
				if(s[i] instanceof Circle)
				{	
					System.out.println("Area of Circle = "+((Circle)s[i]).area()+"\n");
				}
				else if(s[i] instanceof Square)
					{
						System.out.println("Area of Sqaure = "+((Square)s[i]).area()+"\n");
					}
				else
					System.out.println("Area of Rectangle = "+((Rectangle)s[i]).area()+"\n");
			}
		}
		if (index == 0)
			System.out.println("Array is empty!!!");
	}
	
	
	
	public static void addCircle() {
		if (index < s.length) {
			System.out.println("Enter radius and shape elements :- ");
			Shape s_temp = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
			s[index] = s_temp;
			System.out.println("Circle Added Successfully!!!");
			index++;
		} else
			System.out.println("Array is full!!!");
	}
	
	
	public static void addRectangle() {
		if (index < s.length) {
			System.out.println("Enter length width and shape elements :- ");
			Shape s_temp = new Rectangle(sc.nextInt(),sc.nextInt(), sc.nextInt(), sc.nextInt());
			s[index] = s_temp;
			System.out.println("Rectangle Added Successfully!!!");
			index++;
		} else
			System.out.println("Array is full!!!");
	}
	
	
	
	
	public  static void AddSquare() {
		if (index < s.length) {
			System.out.println("Enter side and shape elements :- ");
			Shape s_temp = new Square(sc.nextInt(), sc.nextInt(), sc.nextInt());
			s[index] = s_temp;
			System.out.println("Square Added Successfully!!!");
			index++;
		} else
			System.out.println("Array is full!!!");
	}
	
	
}

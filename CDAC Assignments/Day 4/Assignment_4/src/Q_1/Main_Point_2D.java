package Q_1;

import java.util.Scanner;

public class Main_Point_2D {static public  void main(String[] args) {

	
	Scanner sc = new Scanner(System.in);
	int ch, index=0;
	

	Point_2D[] p = new Point_2D[5];

	do {
		System.out.println("\n1.Show Element  2.Add Element  3.Exit");
		ch = sc.nextInt();
		boolean status=false;
		switch (ch) {

		case 1: {
				for(int i=0;i<p.length;i++) {
					if(p[i]!=null)
						System.out.println("Point"+(i+1)+p[i]);
					else
						break;
			}
				if(index==0)
					System.out.println("Array is empty!!!");
//			
			break;
		}
		case 2:
		{	if(index<p.length) 
			{
			System.out.println("Enter the (x,y) coordinates:- ");
			Point_2D pnt=new Point_2D(sc.nextInt(),sc.nextInt());
			p[index]=pnt;
			index++;
			}
			else
				System.out.println("Array is full!!!");
			break;
		}
		
		case 3:
			System.out.println("Exiting...");
			break;
		}

	} while (ch != 3);
	sc.close();
}

}

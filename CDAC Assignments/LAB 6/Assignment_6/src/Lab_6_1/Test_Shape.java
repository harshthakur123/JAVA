package Lab_6_1;

import java.util.Scanner;

public class Test_Shape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 0, index = 0;
//		Shape s=new Shape(); cannot create instance/object of abstract class

		Shape[] s = new Shape[5];

		do {

			System.out.println("\n1.Show All  2.Add Circle  3.Add Rectangle  4.Add Square  5.Exit ");
			System.out.println("Enter Choice :- ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				logic.show();
				break;

			case 2:

				logic.addCircle();
				break;

			case 3:
				logic.addRectangle();
				break;

			case 4:
				logic.AddSquare();
				break;

			case 5:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Enter valid choice!!!");

			}

		} while (ch != 5);

	}
}

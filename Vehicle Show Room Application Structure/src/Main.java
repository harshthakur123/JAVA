package Q_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ch = 0, index = 0;

		do {
			System.out.println("\n1.Show All  2.Add vehicle 3.Edit Price  4.Edit Colour   5.Remove  6.Exit");

			System.out.println("Enter your choice :-");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				logic.show();
				break;

			case 2:

				logic.add();
				break;

			case 3:
				logic.edit_price();
				break;

			case 4:

				logic.edit_colour();
				break;

			case 5:

				logic.remove();
				break;

			case 6:
				System.out.println("Exiting...");
				System.exit(1);

			default:
				System.out.println("Enter valid choice");
			}

		} while (ch != 6);

	}
}

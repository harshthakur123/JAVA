import java.util.Scanner;

public class Assignment_Day_1_22 {
	public static void main(String[] args) {
		int ch1, ch = 0, total = 0, qty;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Onion = 70.00/- \n2.Paneer = 100/- \n3.Tomato = 90/- \n4.Cheese = 70/- \n5.Exit");
		do {
			System.out.println("Enter you choice:");
			ch1 = sc.nextInt();
			switch (ch1) {
			case 1: {
				System.out.println("Onion Pizza\nEnter Quantity:");
				qty = sc.nextInt();
				total = total + qty * 70;
				break;
			}
			case 2: {
				System.out.println("Paneer Pizza\nEnter Quantity:");
				qty = sc.nextInt();
				total = total + qty * 100;
				break;
			}
			case 3: {
				System.out.println("Tomato Pizza\nEnter Quantity:");
				qty = sc.nextInt();
				total = total + qty * 90;
				break;
			}
			case 4: {
				System.out.println("Cheese Pizza\nEnter Quantity:");
				qty = sc.nextInt();
				total = total + qty * 70;
				break;
			}
			case 5:
				break;

			default:
				System.out.println("Enter Invalid Option");
				break;
			}

		} while (ch1 != 5);
		System.out.println("Total Amount Rs." + total + "/-");

	}
}

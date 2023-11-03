package Assignment_3_2;

import java.util.Scanner;

public class MAIN_Date {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d=new Date();
		
		int ch = 0;
		do {
			System.out.println("\n1.Enter Date  2.Display Date  3.Exit");
			System.out.print("\nEnter Choice:");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1: {
				System.out.println("\nEnter Date in the format DD/MM/YYYY:");
				d.setDay(sc.nextInt());
				d.setMonth(sc.nextInt());
				d.setYear(sc.nextInt());
				break;
			}
			
			case 2:
			{	
				d.display();
				break;
			}
			
			case 3:
				System.out.println("---Program Terminated Successfully---");
				break;

			
			default:
				System.out.println("\nEnter a valid value!!!");
			}

		} while (ch != 3);

	}
}

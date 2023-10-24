package com.code.tester;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int ch=0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(" \n1.Hire Manager   2.Hire Worker" + "   3.Display Details   4.Fire Employee   5.Exit ");
			System.out.println("\nEnter Choice :- ");
			if (sc.hasNextInt())
				ch = sc.nextInt();

			switch (ch) {

			case 1:
				logic.hiremanager();
				break;

			case 2:				
				logic.hireworker();
				break;

			case 3:				
				logic.display();
				break;
			
			case 4:
				logic.fire();	
				break;
				
			case 5:
				System.out.println("Exiting...");
				System.exit(1);

			default :
				System.out.println("Enter valid choice!!!");
			}

		} while (ch != 5);
		sc.close();
	}

}

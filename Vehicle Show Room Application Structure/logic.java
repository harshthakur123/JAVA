package Q_2;

import java.util.Scanner;

// LOGIC FOR SHOW DETAILS 

public class logic {

	static Scanner sc = new Scanner(System.in);

	int ch = 0;

	static int index = 0;
	Vehicle_Showroom vehicle = new Vehicle_Showroom();
	static Vehicle_Showroom[] v = new Vehicle_Showroom[10];

	public static void show() {
		for (int i = 0; i < v.length; i++) {
			if (v[i] != null)
				System.out.println("\nVehicle No. " + (i + 1) + "\n" + v[i]);
		}
		if (index == 0)
			System.out.println("Array is empty!!!");
		// or
		// System.out.println(Arrays.deepToString(v));
		// to print array contents
	}

//LOGIC FOR ADD VEHICLE

	public static void add() {
		if (index < v.length) {
			System.out.println("Enter Id Name Colour Price");
//		int id=sc.nextInt();
//		System.out.println("id done");
//		String name=sc.next();
//		System.out.println("name done");
//		double price=sc.nextDouble();
//		System.out.println("price done");
//		String colour=sc.nextLine();
//		System.out.println("colour done");
			Vehicle_Showroom vs = new Vehicle_Showroom(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
			System.out.println("Data entered successfully!!!");
			// System.out.println(vs);
			v[index] = vs;
			index++;
		}
	}

//LOGIC FOR EDIT PRICE	
	
	public static void edit_price() {
		boolean status = false;
		System.out.println("To get the price of vehicle,enter the id :- ");
		int temp_id = sc.nextInt();
		for (int i = 0; i < v.length; i++) {
			if (v[i].getId() == temp_id) {
				System.out.println("Enter the new price:- ");
				v[i].setPrice(sc.nextDouble());
				System.out.println("Price Changed Successfully!!!");
				status = true;
				break;
			} else {
				status = false;
			}
		}
		if (status == false)
			System.out.println("Vehicle id not found!!!");
	}

	
//LOGIC FOR EDIT COLOUR	
	
	public static void edit_colour() {
		boolean status = false;
		System.out.println("To edit the colour of vehicle,enter the id :- ");
		int temp_id = sc.nextInt();
		for (int i = 0; i < v.length; i++) {
			if (v[i].getId() == temp_id) {
				System.out.println("Enter the new colour:- ");
				v[i].setColour(sc.next());
				System.out.println("Colour Changed Successfully!!!");
				status = true;
				break;
			} else {
				status = false;
			}
		}
		if (status == false)
			System.out.println("Vehicle id not found!!!");

	}
	
	
//LOGIC FOR REMOVING ELEMENT

	public static void remove() {
		boolean status = false;
		if (index == 0) {
			System.out.println("Array is empty!!!");
			// break;
		}

		System.out.println("To remove the vehicle,Enter the id :- ");
		int temp_id = sc.nextInt();
		for (int i = 0; i < v.length; i++) {
			if (v[i].getId() == temp_id) {
				v[i] = null;
				System.out.println("Vehicle Removed successfully!!!");
				status = true;
				break;
			} else {
				status = false;
			}
		}
		if (status == false)
			System.out.println("Vehicle id not found!!!");

	}

}

import java.util.Scanner;

public class Assignment_Day_1_6 {
	public static void main(String[] args) {
		double basic_sal;

		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("Enter the basic salary:");
		basic_sal = sc.nextDouble();

		if (basic_sal < 150000) {
			System.out.println("Basic Salary = " + basic_sal + "\nTax = 0");

		} else if (basic_sal > 150000 && basic_sal < 300000) {
			System.out.println("Basic Salary = " + basic_sal + "\nTax = 20%" + "\nTax = " + 0.2 * basic_sal);
		} else {
			System.out.println("Basic Salary = " + basic_sal + "\nTax = 30%" + "\nTax = " + 0.3 * basic_sal);
		}
	}
}

import java.util.Scanner;

public class Assignment_Day_1_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean status = false;
		System.out.println("Enetr a number:");
		num = sc.nextInt();
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {

				status = true;
				break;
			} else {

			}
		}
		if (status == true)
			System.out.println(num + " is not prime number.");
		else
			System.out.println(num + " is prime");
	}

}
